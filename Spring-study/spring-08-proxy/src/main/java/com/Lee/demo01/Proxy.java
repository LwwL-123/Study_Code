package com.Lee.demo01;

public class Proxy implements Rent {
    private Host host;

    public void rent() {
        host.rent();
    }

    public Proxy() {
    }

    public Proxy(Host host) {
        this.host = host;
    }

    //看房
    public void seeHouse() {
        System.out.println("中介带你看房");
    }

    //收费
    public void fee() {
        System.out.println("收中介费");
    }

    //签合同
    public void contract() {
        System.out.println("签合同");
    }
}