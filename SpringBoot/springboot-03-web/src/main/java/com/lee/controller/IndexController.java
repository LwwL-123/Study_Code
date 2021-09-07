package com.lee.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


//在templates目录下的所有内容，只能通过controller来跳转
@Controller
public class IndexController {
    @RequestMapping({"/","/index.html"})
    public String index(){
        return "index";
    }
}
