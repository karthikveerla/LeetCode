package com.Learn;

import java.util.concurrent.CompletableFuture;

public class AsyncCheckout {
    public static void main(String[] args) {
        System.out.println("user clicked checkout...");

        // 1. Start an asynchronous task (SupplyAsync)
        CompletableFuture<String> checkoutprocess = CompletableFuture.supplyAsync(() -> {
            simulateDelay(3000);
            return "Payment Successful";
        });

        checkoutprocess.thenApply(status->status+" Receipt Printed");

        // 2. Chain a "callback" - This happens automatically when the payment finishes
        checkoutprocess.thenAccept(result ->{
            System.out.println("status:"+ result);
            System.out.println("sending confirmation email");
        });

        // 3. The Main Thread is NOT blocked. It can do other things.
        for(int i=0;i<10;i++){
            System.out.println("main running"+i);
            simulateDelay(1000);
        }

        // Keep the program alive long enough to see the async result
        checkoutprocess.join();
        System.out.println("checkout completed");
    }

    private static void simulateDelay(int ms){
        try{
            Thread.sleep(ms);
        }catch(InterruptedException e){

        }
    }
    
}
