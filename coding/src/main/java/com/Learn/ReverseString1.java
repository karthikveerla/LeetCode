package com.Learn;

public class ReverseString1 {
    public static void main(String[] args) {
        // Practical, production code O(n)
        String s ="Employees";
        StringBuilder sb = new StringBuilder(s);
        System.out.println(sb.reverse().toString());

        //DSA / algorithm round, two pointer
        char[] p = s.toCharArray();
        int left=0, right = p.length-1;
        while(left<right){
            char t = p[left];
            p[left] =p[right];
            p[right] = t;
            left++;
            right--;
        }
        String k = new String(p);
        System.out.println(k);
    }
}
