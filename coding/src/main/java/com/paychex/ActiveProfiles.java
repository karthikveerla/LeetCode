package com.paychex;
import java.util.*;
import java.util.stream.*;

public class ActiveProfiles {
    public static void main(String[] args) {
        List<String> profiles = Arrays.asList("dev", "test", "prod", "qa", "staging");
        List<String> activeprofiles = Arrays.asList("dev","qa","prod");
        List<String> result = profiles.stream()
                .filter(env -> !activeprofiles.contains(env))
                .collect(Collectors.toList());
        System.out.println("Inactive profiles:");
        result.forEach(System.out::println);
    }
}
