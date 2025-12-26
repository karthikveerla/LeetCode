package com.Leet;

public class PermutationInString {

    public static boolean findPermutation(String s1,String s2){
        if(s1.length() > s2.length()){
            return false;
        }
        int[] s1freq = new int[26];
        int[] s2freq = new int[26];
        for(int i=0;i<s1.length();i++){
            s1freq[s1.charAt(i)-'a']++;
            s2freq[s2.charAt(i)-'a']++;
        }
        for(int i=0;i<s2.length()-s1.length();i++){
            if(isEqual(s1freq,s2freq)){
                return true;
            }
            s2freq[s2.charAt(i)-'a']--;
            s2freq[s2.charAt(i+s1.length())-'a']++;
        }
        return isEqual(s1freq, s2freq);
    }

    public static boolean isEqual(int[] s1freq, int[] s2freq){
        for(int i=0;i<26;i++){
            if(s1freq[i]!=s2freq[i]){
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        String s1 = "xyx";
        String s2 = "acbyzxgrtyx";
        System.out.println(findPermutation(s1,s2));
    }
}
