package com.Lee.lesson1;

import java.net.InetAddress;
import java.net.UnknownHostException;

public class TestInetAddress {
    public static void main(String[] args) {
        try {
            InetAddress inetAddress = InetAddress.getByName("127.0.0.1");
            System.out.println(inetAddress);
            InetAddress inetAddress2 = InetAddress.getByName("www.baidu.com");
            System.out.println(inetAddress2);
        } catch (UnknownHostException e) {
            e.printStackTrace();
        }
    }
}
