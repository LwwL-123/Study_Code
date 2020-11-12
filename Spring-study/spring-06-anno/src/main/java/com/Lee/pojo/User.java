package com.Lee.pojo;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

//等价于 <bean  id="user" class="com.Lee.pojo.User"/>
@Component
public class User {
    public String name;
    //相当于 <bean name="name" class="com.kuang.pojo.User"/>
    @Value("111")
    public void setName(String name) {
        this.name = name;
    }
}
