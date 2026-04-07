package com.Learn;

public class Fibonacci {
    public static void main(String[] args) {
        int a = 0, b = 1;
        int n = 10;
        for(int i=0;i<=n;i++){
            System.out.print(a+" ");
            int t = a + b;
            b = a;
            a = t;
        }
    }
}
