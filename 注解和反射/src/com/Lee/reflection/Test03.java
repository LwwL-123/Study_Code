package com.Lee.reflection;

public class Test03 {
    public static void main(String[] args) {
        A a = new A();
        System.out.println(A.m);

        /*
        *
        * */
    }
}

class A{
    static {
        System.out.println("A静态代码块初始化");
        m = 300;
    }
    static int m = 100;

    public A(){
        System.out.println("A的无参构造初始化");
    }
}