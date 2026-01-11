package com.Learn;
import java.io.*;
public class Exceptions {

    public static void checkedException(){
        try{
        FileReader fd = new FileReader("C:/Users/karthik veerla/Desktop/USA/JOB SEARCH/Drafts.txt");
        fd.read();
        System.out.println(fd);
        fd.close();
        }
        catch(IOException e){
            e.printStackTrace();
        }
    }

    public static void uncheckedExceptions(){
        int[] a= {1,2,3,4};
        try{
        System.out.println(a[5]);
        }
        catch(Exception e){
            System.out.println(e.getMessage());
        }
    }

    public static void Arithmatic() throws ArithmeticException{
        int a = 1;
        int b = 0;

        System.out.println(a/b);
       
    }

    public static void main(String[] args){
        // checkedException();
        // uncheckedExceptions();
        try{
        Arithmatic();
        }
        finally{
            System.out.println("finally");
        }
    }
}
