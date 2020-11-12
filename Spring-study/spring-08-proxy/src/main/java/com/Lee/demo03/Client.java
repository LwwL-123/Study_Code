package com.Lee.demo03;

import com.Lee.demo04.ProxyInvocationHandler;

public class Client {
    public static void main(String[] args) {
        //真实角色
        Host host = new Host();

        //代理角色:现在没有
        ProxyInvocationHandler pih = new ProxyInvocationHandler();
        //通过调用程序处理角色,来处理我们要调用的接口
        pih.setTarget(host);
        Rent proxy = (Rent) pih.getProxy();//proxy动态生成的
        proxy.rent();
    }
}
