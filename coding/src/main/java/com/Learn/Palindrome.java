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

    public static boolean isValidPalindrome(int k){
        int rev = 0, p =k;
        while(k>0){
            int r = k%10;
            rev = rev*10+r;
            k=k/10;
        }
        return rev == p;
    }

    public static void main(String[] args) {
        String s = "welcome";
        int k = 4245;
        System.out.println(isValidPalindrome(k));
        System.out.println(isPalindrome(String.valueOf(k)));
    }
}
