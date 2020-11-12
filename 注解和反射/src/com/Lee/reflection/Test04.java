package com.Lee.reflection;

//测试类什么时候会初始化
public class Test04 {

    static {
        System.out.println("main类被加载");
    }

    public static void main(String[] args) throws ClassNotFoundException {
        //主动引用
        //Son son = new Son();

        //反射会产生主动引用
        //Class.forName("com.Lee.reflection.Son");

        //不会产生类的调用的方法
        System.out.println(Son.b);
    }
}

class Father {
    static {
        System.out.println("父类被加载");
    }

    static int b = 2;

}

class Son extends Father {
    static {
        System.out.println("子类被加载");
    }

    static int m = 100;
    static final int M = 1;

}