package com.Lee.demo2;

import java.util.concurrent.*;

public class TsetCallable implements Callable {

    @Override
    public Boolean call() throws Exception {
        return true;
    }

    public static void main(String[] args) throws ExecutionException, InterruptedException {
        TsetCallable t1 = new TsetCallable();
        //创建执行服务
        ExecutorService executorService = Executors.newFixedThreadPool(3);
        //提交执行
        Future<Boolean> submit = executorService.submit(t1);
        //获取结果
        Boolean aBoolean = submit.get();
        //关闭服务
        executorService.shutdownNow();

    }
}
