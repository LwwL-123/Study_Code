package com.Lee.demo02;

public class Client {
    public static void main(String[] args) {
        UserServiceImpl userService = new UserServiceImpl();
//        userService.add();

        UserServiceProxy proxy = new UserServiceProxy();
        proxy.setUserService(userService);
        proxy.add();
        System.out.println("======");
        proxy.delete();
        System.out.println("======");
        proxy.update();
        System.out.println("======");
        proxy.query();
        System.out.println("======");
    }
}
