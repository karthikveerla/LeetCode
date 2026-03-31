package com.Learn;
import java.util.*;

public class DuplicatesList {
    public static void main(String[] args) {
        List<String> l =Arrays.asList("apple","bat","cat","dog","cat","bat");
        Set<String> seen = new HashSet<>();
        Set<String> dup = new HashSet<>();
        for(String li:l){
            if(!seen.add(li)){
                dup.add(li);
            }
        }
        System.out.println(dup);
    }
}
