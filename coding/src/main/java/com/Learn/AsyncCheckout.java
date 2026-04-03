package com.Learn;

import java.util.concurrent.CompletableFuture;

public class AsyncCheckout {
    public static void main(String[] args) {
        System.out.println("user clicked checkout...");
        CompletableFuture<String> checkoutprocess = CompletableFuture.supplyAsync(() -> {
            simulateDelay(2000);
            return "Payment Successful";
        });
        checkoutprocess.thenAccept(result ->{
            System.out.println("status:"+ result);
            System.out.println("sending confirmation email");
        });
        for(int i=0;i<6;i++){
            System.out.println("main running"+i);
            simulateDelay(500);
        }
        checkoutprocess.join();
        System.out.println("checkout complete");
    }

    private static void simulateDelay(int ms){
        try{
            Thread.sleep(ms);
        }catch(InterruptedException e){

        }
    }
    
}
