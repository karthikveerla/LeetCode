package com.Learn;

public class DuplicateCharacters {
    public static void isCharacter(String s){
        int[] a = new int[26];
        for(char c:s.toLowerCase().toCharArray()){
            a[c-'a']++;
        }
        StringBuilder sb = new StringBuilder();
        for(int i=0;i<26;i++){
            if(a[i]>0){
                sb.append((char)(i+'a'));
            }
        }
        System.out.println(sb);
    }
    public static void main(String[] args) {
        String s = "adaptorers";
        isCharacter(s);
    }
}
