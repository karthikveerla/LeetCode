package com.Learn;

import java.util.concurrent.CompletableFuture;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class CompletableFutureThread {
    public static void main(String[] args) {
        CompletableFuture<String> cf = new CompletableFuture<>();
        Executors.newSingleThreadExecutor().submit(()->{
            try{
             TimeUnit.SECONDS.sleep(2);
            }catch(InterruptedException e){
                e.printStackTrace();
            }
            cf.complete("Hello world");
        });

        while(!cf.isDone()){
            System.out.println("processing...");
        }
        try{
            System.out.println(cf.get());
        }catch(Exception e){
            e.printStackTrace();
        }
    }
}
