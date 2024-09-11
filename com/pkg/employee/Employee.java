package com.pkg.employee;

public class Employee {
  private static int idGen = 0;
  private int id;
  private String name;
  private String department;
  private double salary;

  public Employee(String name, String department, double salary){
    this.id = ++idGen;
    this.name = name;
    this.department = department;
    this.salary = salary;
  }

  public double getSalary(){
    return salary;
  }

  public String toString(){
    return "id:" + id + ", name:" + name + ", department:" + department + ", salary:" + salary;
  }
}
