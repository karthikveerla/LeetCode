package com.paychex;
import java.util.*;
import java.util.stream.*;

public class ActiveProfiles {
    public static void main(String[] args) {
        List<String> profiles = Arrays.asList("dev", "test", "prod", "qa", "staging");
        List<String> activeprofiles = Arrays.asList("dev","qa","prod");

        // Find profiles that are not active
        List<String> result = profiles.stream()
                .filter(env -> !activeprofiles.contains(env))
                .collect(Collectors.toList());
        System.out.println("Inactive profiles:");
        result.forEach(System.out::println);

        // Find profiles that start with 'p'
        List<String> result2 = profiles.stream()
                .filter(a->a.startsWith("p"))
                .collect(Collectors.toList());
        System.out.println("Profiles starting with 'p':");
        result2.forEach(System.out::println);


        // Find profiles with length greater than 3
        List<String> result3 = profiles.stream()
                .filter(a->a.length()>3)
                .collect(Collectors.toList());
        System.out.println("Profiles with length greater than 3:");
        result3.forEach(System.out::println);


        // Find profiles that contain 'a' and convert to uppercase
        List<String> result4 = profiles.stream()
                .filter(a->a.contains("a"))
                .map(String::toUpperCase)
                .collect(Collectors.toList());
        System.out.println("Profiles containing 'a' (uppercase):");
        result4.forEach(System.out::println);
        // Count profiles that end with 'g'
        long count = profiles.stream()
                .filter(a->a.endsWith("g"))
                .count();
        System.out.println("Number of profiles ending with 'g': " + count);     
    }
}
