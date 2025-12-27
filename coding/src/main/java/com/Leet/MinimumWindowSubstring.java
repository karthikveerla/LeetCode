package com.Leet;

import java.util.HashMap;
import java.util.Map;

public class MinimumWindowSubstring {

    public static String findSubString(String s,String t){
        if(s.length()==0||t.length()==0||s.length()<t.length()){
            return "";
        }
        Map<Character,Integer> tmap = new HashMap<>();
        for(int i=0;i<t.length();i++){
            tmap.put(t.charAt(i),tmap.getOrDefault(t.charAt(i), 0)+1);
        }
        int l=0,r=0;
        int required = tmap.size();
        int create = 0;
        int[] arr = new int[]{-1,0,0};
        Map<Character,Integer> smap = new HashMap<>();
        while(r<s.length()){
            char c = s.charAt(r);
            smap.put(c,smap.getOrDefault(c, 0)+1);
            if(tmap.containsKey(c)&&tmap.get(c).intValue() == smap.get(c).intValue()){
                create++;
            }
                while(l <= r && required == create){
                    c = s.charAt(l);
                    if(arr[0] == -1 || arr[0] >= r-l+1){
                        arr[0] = r-l+1;
                        arr[1] = l;
                        arr[2] = r;
                    }
                    smap.put(c,smap.get(c)-1);
                    if(tmap.containsKey(c)&&tmap.get(c).intValue() > smap.get(c).intValue()){
                        create--;
                    }
                    l++;
                }
            r++;
        }
        if(arr[0] == -1){
            return "";
        }
        return s.substring(arr[1],arr[2]+1);
    }

    public static void main(String[] args) {
        String s = "ADOBECODEBANC";
        String t = "ABC";
        System.out.println(findSubString(s,t));
    }
    
}
