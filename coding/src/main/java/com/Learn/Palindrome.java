package com.Learn;

public class Palindrome {

    //time O(n), space O(n)
    // public static boolean isPalindrome(String s){
    //     String p=new StringBuilder(s).reverse().toString();
    //     return p.equals(s);
    // }

    // time O(n) , space O(1)

    public static boolean isPalindrome(String s){
        int left =0,right = s.length()-1;
        while(left < right){
            if(s.charAt(left)!=s.charAt(right)){
                return false;
            }
            left++;
            right--;
        }
        return true;
    }
    public static void main(String[] args) {
        String s = "welcome";
        System.out.println(isPalindrome(s));
    }
}
