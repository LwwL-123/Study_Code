package com.Lee.lambda;
/*
推导lambda表达式
*/
public class TestLambda1 {

    //3.静态内部类
    static class Like2 implements Ilike{
        @Override
        public void lambda() {
            System.out.println("22222");
        }
    }

    public static void main(String[] args) {
        Ilike like = new Like();
        like.lambda();

        like = new Like2();
        like.lambda();

        //4.局部内部类
        class Like3 implements Ilike{
            @Override
            public void lambda() {
                System.out.println("33333");
            }
        }

        like = new Like3();
        like.lambda();

        //5.匿名内部类
        like = new Ilike() {
            @Override
            public void lambda() {
                System.out.println("44444");
            }
        };
        like.lambda();

        //6.用lambda简化
        like = ()->{
            System.out.println("55555");
        };
        like.lambda();
    }
}

//定义一个函数式接口
interface Ilike{
    void lambda();
}

//实现类
class Like implements Ilike{
    @Override
    public void lambda() {
        System.out.println("11111");
    }
}