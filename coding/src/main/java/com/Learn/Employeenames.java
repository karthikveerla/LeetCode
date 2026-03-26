package com.Learn;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import com.Entities.Employee;

public class Employeenames {
    public static void main(String[] args) {
        List<Employee> emplist = new ArrayList<Employee>();
        emplist.add(new Employee(1,"Alex",65000,"SDE"));
        emplist.add(new Employee(2,"Bob",35000,"IT"));
        emplist.add(new Employee(3,"Clein",40000,"HR"));
        emplist.add(new Employee(4,"Aman",25000,"IT"));
        emplist.add(new Employee(5,"Erica",5000,"HR"));
        emplist.add(new Employee(6,"Akram",95000,"SDE"));
        
        List<String> names = emplist.stream()
                                    .map(Employee::getName)
                                    .filter(x->x.toUpperCase().startsWith("A"))
                                    .map(String::toUpperCase)
                                    .sorted()
                                    .collect(Collectors.toList());
        System.out.println(names);
        }
}
