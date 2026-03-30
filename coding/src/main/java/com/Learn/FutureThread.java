package com.Learn;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class FutureThread {
    public static void main(String[] args) throws ExecutionException,InterruptedException{
        Future<Object> f = Executors.newSingleThreadExecutor().submit(()->{
            return "Hello world";
        });
        System.out.println(f.get());
        System.out.println(f.isDone());
    }
    
}
