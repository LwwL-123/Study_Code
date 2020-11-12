package cn.itcast.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping(path = "/anno")
public class AnnoController {

    @RequestMapping(path = "/testRequestParm")
    public String testRequestParm(String username){
        System.out.println("执行了...");
        System.out.println(username);
        return "success";
    }

    /**
     * PathVariable注解
     * @param id
     * @return
     */
    @RequestMapping(path = "/testPathVariable/{sid}")
    public String testPathVariable(@PathVariable(name="sid") String id){
        System.out.println("执行了...");
        System.out.println(id);
        return "success";
    }


    /**
     *ModelAttribute注解
     * @return
     */
    @RequestMapping(path = "/testModelAttribute")
    public String testModelAttribute(){
        System.out.println("testModelAttribute执行了...");
        return "success";
    }
    /**
     * 该方法会先执行
     */
    @ModelAttribute
    public void showUser(){
        System.out.println("showUser执行了");
    }

    /**
     * SessionAttributes的注解
     * @return
     */
    @RequestMapping(path = "/testSessionAttributes")
    public String testSessionAttributes(){
        System.out.println("testSessionAttributes执行了...");
        return "success";
    }
}
