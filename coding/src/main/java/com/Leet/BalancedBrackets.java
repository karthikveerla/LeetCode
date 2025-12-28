package com.Leet;

import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

public class BalancedBrackets {
    public static boolean balanced(String s){
        Stack<Character> p = new Stack<>();
        Map<Character,Character> maps = new HashMap<>();
        maps.put(')', '(');
        maps.put('}', '{');
        maps.put(']', '[');
        for(int i =0;i<s.length();i++){
            char c = s.charAt(i);
            if(!maps.containsKey(c)){
                p.push(c);
            }
            else{
                if(p.isEmpty()){
                    return false;
                }
                char j = p.pop();
                if(j != maps.get(c)){
                    return false;
                }
            }
        }
        return p.isEmpty();
    }
    public static void main(String[] args) {
        String s = "[((}))]()";
        System.out.println(balanced(s));
    }
}
