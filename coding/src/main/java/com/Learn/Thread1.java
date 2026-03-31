package com.Learn;

import java.util.concurrent.Callable;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class Thread1{
    public static void main(String[] args) throws InterruptedException {
        //Extending Thread
        Thread t1 = new Thread2();
        t1.start();

        //Implementing Runnable
        Runnable r = ()->{
            System.out.println("using runnable");
        };
        new Thread(r).start();

        //Lambda function
        new Thread(()->{System.out.println("using Lambda");});

        //Callable + future
        Callable<String> cb = ()->{
            System.out.println("using callable");
            return "hello";
        };
        ExecutorService es = Executors.newSingleThreadExecutor();
        Future<String> ft = es.submit(cb);

        //Completablefuture
        CompletableFuture.runAsync(()->{
            System.out.println("using completable future");
        });
    }
}

class Thread2 extends Thread{
        @Override
        public void run(){
            System.out.println("using extends thread");
        }
}