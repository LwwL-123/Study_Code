package com.Lee.demo1;

public class TestThread3 implements Runnable{


    //票数
    private int nums = 10;
    @Override
    public synchronized void run() {
        while(true){
            if(nums<=0){
                break;
            }
            System.out.println(Thread.currentThread().getName()+"拿到了第"+nums--+"张票");
        }
    }

    public static void main(String[] args) {
        TestThread3 ticket = new TestThread3();

        new Thread(ticket,"小明").start();
        new Thread(ticket,"小李").start();
        new Thread(ticket,"小红").start();

    }
}
