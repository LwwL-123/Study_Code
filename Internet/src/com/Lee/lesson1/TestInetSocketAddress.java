package com.Lee.lesson1;

import java.net.InetSocketAddress;

public class TestInetSocketAddress {
    public static void main(String[] args) {
        InetSocketAddress inetSocketAddress = new InetSocketAddress("47.116.70.98",8080);
        System.out.println(inetSocketAddress);

        System.out.println(inetSocketAddress.getHostName());
    }
}
