package cn.itcast.controller;
/**
 * 1.启动服务器，加载一些配置文件
 *      *dispatcherServlet对象创建
 *      *springmvc.xml配置文件被加载
 *      *HelloController创建成对象
 *
 * 2.发送请求,后台处理请求
 */

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

//控制器的类
@Controller
@RequestMapping(path = "/user")
public class HelloController {

    @RequestMapping(path = "/hello")
    public String sayHello(){
        System.out.println("Hello StringMVC");
        return "success";
    }

    @RequestMapping(path = "/testRequestMapping",
                            params = {"username=hehe"},
                            headers = {"Accept"})
    public String testRequestMapping(){
        System.out.println("测试RequestMapping注解...");
        return "success";
    }
}
