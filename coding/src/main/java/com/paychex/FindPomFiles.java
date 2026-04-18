
package com.paychex;

import java.util.*;
import java.io.*;

public class FindPomFiles {
    public static void main(String[] args) {
        String path = "src/main/java/com/paychex";
        File dir = new File(path);
        if(!dir.exists() || !dir.isDirectory()){
            System.out.println("Invalid directory path");
            return;
        }
        List<File> pomfiles = new ArrayList<>();
        findPomFiles(dir, pomfiles);
        System.out.println("Found " + pomfiles.size() + " pom.xml files:");
        for(File pom : pomfiles){
            System.out.println(pom.getAbsolutePath());
        }
    }

    private static void findPomFiles(File dir, List<File> pomfiles) {
        File[] files = dir.listFiles();
        if(files != null){
            for(File file:files){
                if(file.isDirectory()){
                    findPomFiles(file,pomfiles);
                }
                else if(file.getName().equalsIgnoreCase("pom.xml")){
                    pomfiles.add(file);
                }
            }
        }
    }
}
