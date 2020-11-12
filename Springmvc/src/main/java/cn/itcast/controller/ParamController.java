package cn.itcast.controller;

import cn.itcast.domin.Account;
import cn.itcast.domin.User;
import org.springframework.http.HttpRequest;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.ServletContext;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * 请求参数绑定
 */
@Controller
@RequestMapping("/param")
public class ParamController {
    /**
     * 请求参数绑定的入门
     * @return
     */
    @RequestMapping(path = "/testParam")
    public String testParam(String username,String mima){
        System.out.println("执行了...");
        System.out.println("用户名:"+username);
        System.out.println("密码:"+mima);
        return "success";
    }

    /**
     * 把java封装到Javabeen这个类当中
     * @return
     */
    @RequestMapping(path = "/savaAccount")
    public String savaAccount(Account account){
        System.out.println("执行了...");
        System.out.println(account);
        return "success";
    }

    /**
     * 自定义类型转换器
     * @param user
     * @return
     */
    @RequestMapping(path = "/savaUser")
    public String savaUser(User user){
        System.out.println("执行了...");
        System.out.println(user);
        return "success";
    }

    /**
     *servlet原生API
     * @return
     */
    @RequestMapping(path = "/testServlet")
    public String testServlet(HttpServletRequest request, HttpServletResponse response){
        System.out.println("执行了...");
        System.out.println(request);

        HttpSession session = request.getSession();
        System.out.println(session);

        ServletContext servletContext = session.getServletContext();
        System.out.println(servletContext);
        System.out.println(response);
        return "success";
    }

}
