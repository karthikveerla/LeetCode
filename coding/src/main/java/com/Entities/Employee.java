package com.Entities;

public class Employee {
    private int Id;
    private String Name;
    private double Salary;
    private String Dept;
    public Employee(int id, String name, double salary, String dept) {
        Id = id;
        Name = name;
        Salary = salary;
        Dept = dept;
    }
    public int getId() {
        return Id;
    }
    public void setId(int id) {
        Id = id;
    }
    public String getName() {
        return Name;
    }
    public void setName(String name) {
        Name = name;
    }
    public double getSalary() {
        return Salary;
    }
    public void setSalary(Long salary) {
        Salary = salary;
    }
    public String getDept() {
        return Dept;
    }
    public void setDept(String dept) {
        Dept = dept;
    }
    @Override
    public String toString() {
        return "Employee [Id=" + Id + ", Name=" + Name + ", Salary=" + Salary + ", Dept=" + Dept + "]";
    }
}
