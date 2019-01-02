package com.example.springBootDemo.utils;

import java.util.concurrent.*;

/**
 * Created by v-caozuyun-os on 2018/11/7.
 * 线程池的使用
 */
public class ThreadDemo {
    private static  final ExecutorService pool = Executors.newCachedThreadPool();

    public static void main(String[] args) throws InterruptedException, ExecutionException {
        //batchTaskForUpdate();

        ScheduledThreadPoolExecutor exec = new ScheduledThreadPoolExecutor(1);
        exec.scheduleAtFixedRate(new Runnable() {
            //每隔一段时间就触发异常
            @Override
            public void run() {
                System.out.println("================");
            }
        }, 1000, 5000, TimeUnit.MILLISECONDS);
        exec.scheduleAtFixedRate(new Runnable() {
            //每隔一段时间打印系统时间，证明两者是互不影响的
            @Override
            public void run() {
                System.out.println(System.nanoTime());
            }
        }, 1000, 5000, TimeUnit.MILLISECONDS);
    }

    public static void  batchTaskForUpdate() throws InterruptedException, ExecutionException {
            //pool.submit(new MyCallback());
        pool.execute(new Runnable() {
            @Override
            public void run() {
                try {
                    Thread.sleep(60);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                System.out.print("22222");
            }
        });
    }

    private static class MyCallback implements Callable<String> {
        @Override
        public String call() throws Exception {
            Thread.sleep(60);
            System.out.print("22222");
            return "";
        }
    }
}