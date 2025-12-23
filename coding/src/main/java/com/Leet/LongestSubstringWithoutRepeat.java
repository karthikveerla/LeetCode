package com.Leet;

import java.util.HashSet;

public class LongestSubstringWithoutRepeat {
    public static void main(String[] args) {
        String s = "pwkw";
        HashSet<Character> vs = new HashSet<>();
        int maxLen = 0;
        int left = 0, right = 0;
        while(right <s.length()){
            char c = s.charAt(right);
            if(!vs.contains(c)){
                vs.add(c);
                right++;
                maxLen = Math.max(maxLen,right-left);
            }
            else{
                while(vs.contains(c)){
                    vs.remove(s.charAt(left));
                    left++;
                }
            }
        }
        System.out.println(maxLen);
    }
}
