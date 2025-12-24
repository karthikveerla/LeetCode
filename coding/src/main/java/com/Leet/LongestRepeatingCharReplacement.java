package com.Leet;

import java.util.Arrays;

public class LongestRepeatingCharReplacement {

    public static int findReplaceChar(String s, int k){
        int maxlen = 0;
        int[] freq = new int[26];
        Arrays.fill(freq, 0);
        int left =0,right =0;
        int maxocc = 0;
        for(;right < s.length();right++){
            maxocc = Math.max(maxocc,++freq[s.charAt(right)-'A']);
            if(right-left+1-maxocc > k){
                freq[s.charAt(left)-'A']--;
                left++;
            }
            maxlen = Math.max(maxlen,right-left+1);
        }

        return maxlen;
    }

    public static void main(String[] args) {
        String s = "APXPA";
        int k = 2;
        System.out.println(findReplaceChar(s,k));
    }
}
