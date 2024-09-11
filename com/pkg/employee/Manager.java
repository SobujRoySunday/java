package com.pkg.employee;

import com.pkg.employee.Employee;

public class Manager extends Employee {
  private double bonus;
  
  public Manager(String name, String department, double salary, double bonus){
    super(name, department, salary);
    this.bonus = bonus;
  }

  public double getTotalSalary(){
    return getSalary() + bonus;
  }

  public String toString(){
    return super.toString() + ", bonus:" + bonus;
  }
}
