package com.Lee.config;

import com.Lee.pojo.User;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class MyConfig {
    //注册一个bean
    //这个方法的名字,就相当于bean标签中的id属性
    //这个方法的返回值,就是相当于bean标签中的class属性
    @Bean
    public User getUser() {
        return new User();//就是返回要注入bean的对象
    }


}
