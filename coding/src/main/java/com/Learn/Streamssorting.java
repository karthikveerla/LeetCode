package com.Learn;
import java.util.*;
import java.util.stream.Collectors;

import com.Entities.Employee;

public class Streamssorting {
    public static void main(String[] args) {
        List<Employee> emplist = new ArrayList<Employee>();
        emplist.add(new Employee(1,"Alex",65000,"SDE"));
        emplist.add(new Employee(2,"Bob",35000,"IT"));
        emplist.add(new Employee(3,"Clein",40000,"HR"));
        emplist.add(new Employee(4,"Devin",25000,"IT"));
        emplist.add(new Employee(5,"Erica",5000,"HR"));
        emplist.add(new Employee(6,"Farhan",95000,"SDE"));
        List<Employee> empres = emplist.stream()
                                .sorted((a,b)->(int)(b.getSalary()-a.getSalary()))
                                .skip(3)
                                .collect(Collectors.toList());
        System.out.println(empres);
    }
}
