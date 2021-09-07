package com.Lee.JVM;

import java.util.ArrayList;

public class Demo {

    byte[] array = new byte[1 * 1024 * 1024];

    public static void main(String[] args) {
        ArrayList<Demo> list = new ArrayList<>();
        int count = 0;

        try {
            while (true) {
                list.add(new Demo());
                count++;
            }
        } catch (Error e) {
            System.out.println("count"+count);
            e.printStackTrace();
        }

    }
}
