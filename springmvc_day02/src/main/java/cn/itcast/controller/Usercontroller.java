package cn.itcast.controller;

import cn.itcast.domain.User;
import com.sun.org.apache.regexp.internal.RE;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@Controller
@RequestMapping("/user")
public class Usercontroller {
    /**
     *返回值为string
     * @return
     */
    @RequestMapping("/testString")
    public String testString(Model model){
        System.out.println("testString方法执行了");
        //模拟从数据库查询出User的对象
        User user = new User();
        user.setUsername("lzw");
        user.setPassword("123");
        user.setAge(23);
        //model对象
        model.addAttribute("user",user);
        return "success";
    }

    /**
     * 返回值为void
     */
    @RequestMapping("/tsetVoid")
    public void tsetVoid(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        System.out.println("tsetVoid方法执行了");
        //编写请求转发的程序
        //request.getRequestDispatcher("/WEB-INF/pages/success.jsp").forward(request,response);

        //重定向
        //response.sendRedirect(request.getContextPath()+"/index.jsp");

        //设置中文乱码
        response.setCharacterEncoding("UTF-8");
        response.setContentType("text/html;charset=UTF-8");
        //直接会进行响应
        response.getWriter().print("你好");
        return;
    }

    /**
     * 返回ModelAndView对象
     * @return
     */
    @RequestMapping("/tsetModelAndView")
    public ModelAndView tsetModelAndView(){
        System.out.println("tsetModelAndView方法执行了");
        //创建ModelAndView
        ModelAndView mv = new ModelAndView();
        //模拟从数据库查询出User的对象
        User user = new User();
        user.setUsername("lzw");
        user.setPassword("456");
        user.setAge(23);

        //把user对象存储到mv中,也会把user对象存入到request对象
        mv.addObject("user",user);

        //跳转到哪个页面(用视图解析器)
        mv.setViewName("success");
        return mv;
    }

}
