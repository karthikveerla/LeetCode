package com.paychex;

public class FirstUniqueChar {
    public static void main(String[] args) {
        String s = "leetcode";
        int index = firstUniqChar(s);
        if(index != -1){
            System.out.println("First unique character: " + s.charAt(index) + " at index " + index);
        }
        else{
            System.out.println("No unique character found.");
        }
    }

    private static int firstUniqChar(String s) {
        int[] count = new int[26];
        for (char c : s.toCharArray()) {
            count[c - 'a']++;
        }
        for (int i = 0; i < s.length(); i++) {
            if (count[s.charAt(i) - 'a'] == 1) {
                return i;
            }
        }
        return -1;
    }

}
