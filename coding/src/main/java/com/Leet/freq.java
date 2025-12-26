package com.Leet;
import java.util.HashMap;
import java.util.Map;
public class freq {
    public static void main(String[] args) {
        String s = "welcome to Raleigh!";
        Map<Character,Integer> fre = new HashMap<>();
        for(int i=0;i<s.length();i++){
            fre.compute(s.charAt(i), (k,v) -> (v == null)? 1: ++v);
            if(fre.containsKey(s.charAt(i))){
                fre.put(s.charAt(i), fre.getOrDefault(s.charAt(i), 0)+1);
            }else{
                fre.put(s.charAt(i),1);
            }
        }
        System.out.println(fre);
    }
}
