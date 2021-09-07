package com.example.demo.controller;



import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

//测试配置问文件
@RestController
@RequestMapping("api/v1/test")
public class TestController {
    @GetMapping("testJson")
    public Object testJson(){
        Map<Integer,String> map=new HashMap<>();
        map.put(1,"第一个接口测试");
        map.put(2,"test");
        map.put(3,"test");

        return map;
    }
}
