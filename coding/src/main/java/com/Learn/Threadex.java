package com.Learn;
public class Threadex extends Thread{
    public static void main(String[] args) {
        Thread t1 = new Thread();
        Thread t2 = new Thread();
        t1.start();
        System.out.println(t1.getName());
        System.out.println(t1.equals(t2));
        System.out.println(t1.threadId());
        System.out.println(t1.getState());
    }
}
