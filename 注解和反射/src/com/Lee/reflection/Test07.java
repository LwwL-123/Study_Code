package com.Lee.reflection;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class Test07 {
    public static void main(String[] args) throws NoSuchMethodException, ClassNotFoundException, IllegalAccessException, InvocationTargetException, InstantiationException, NoSuchFieldException {
        //获取class对象
        Class c1 = Class.forName("com.Lee.reflection.User");

        //构造一个对象,本质是调用了无参构造
        User user = (User) c1.getDeclaredConstructor().newInstance();
        System.out.println(user);
        System.out.println("==========");

        //通过构造器创建对象
        Constructor constructor = c1.getDeclaredConstructor(String.class, int.class, int.class);
        User user2 = (User) constructor.newInstance("lzw", 001, 23);
        System.out.println(user2);
        System.out.println("==========");

        //通过反射调用普通方法
        User user3 = (User) c1.getDeclaredConstructor().newInstance();
        //通过反射获取方法
        //invoke激活
        //(对象,方法的值)
        Method setName = c1.getDeclaredMethod("setName", String.class);
        setName.invoke(user3,"lzw");
        System.out.println(user3.getName());
        System.out.println("==========");

        //通过反射操作属性
        User user4 = (User) c1.getDeclaredConstructor().newInstance();
        Field name = c1.getDeclaredField("name");
        //不能直接操作私有属性,需要关闭安全监测 setAccessible(true)
        name.setAccessible(true);//可访问,取消安全监测
        name.set(user4,"lzw2");
        System.out.println(user4.getName());
        System.out.println("==========");

    }
}
