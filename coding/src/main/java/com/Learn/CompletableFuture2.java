package com.Learn;

import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;

public class CompletableFuture2 {
    public static void main(String[] args) throws InterruptedException,ExecutionException{
        CompletableFuture<String> cf = CompletableFuture.supplyAsync(()->"Hello").thenApply(x->x+"world");
        System.out.println(cf.get());

        CompletableFuture<String> cf2 = getHello().thenCompose((hello)->getmsg(hello));
        System.out.print(cf2.get());
        
    }

    private static CompletableFuture<String> getHello(){
        return CompletableFuture.supplyAsync(()->"Bye");
    }

    private static CompletableFuture<String> getmsg(String Hellomsg){
        return CompletableFuture.supplyAsync(() -> Hellomsg + " World");
    }
}
