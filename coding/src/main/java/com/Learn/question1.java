package com.Learn;

import java.util.*;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class question1 {
    public static void main(String[] args) {
        List<String> s = Arrays.asList("alice","bob","chris","david","erikson","fernando","greg","heather","irfan");
        System.out.println(s.stream()
        .filter(p->p.contains("a"))
        .sorted(Comparator.comparing(String::length))
        .toList());
    }
}
