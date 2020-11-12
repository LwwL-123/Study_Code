package com.Lee.reflection;

import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class Test06 {
    public static void main(String[] args) throws ClassNotFoundException, NoSuchFieldException {

        User user = new User();
        Class c1 = user.getClass();

        //获得类的名字
        System.out.println(c1.getName());
        System.out.println(c1.getSimpleName());

        //获取类的属性
        System.out.println("获取类的属性=======");
        Field[] fields = c1.getFields();//getFields只能找到public属性
        for (Field field : fields) {
            System.out.println(field);
        }

        System.out.println("=======");
        Field[] fields1 = c1.getDeclaredFields();//getDeclaredFields可以打印所有属性
        for (Field field : fields1) {
            System.out.println(field);
        }

        System.out.println("=======");
        Field name = c1.getDeclaredField("name");
        System.out.println(name);

        //获取类的方法
        System.out.println("获取类的方法=======");
        Method[] methods = c1.getMethods();
        for (Method method : methods) {
            System.out.println(method);
        }

        System.out.println("=======");
        Method[] declaredMethods = c1.getDeclaredMethods();
        for (Method declaredMethod : declaredMethods) {
            System.out.println(declaredMethod);
        }


    }
}
