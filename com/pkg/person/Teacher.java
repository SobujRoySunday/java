package com.pkg.person;

import com.pkg.person.Person;

public class Teacher extends Person {
  private static int IDGen = 0;
  private int teacherID;
  private double salary;
  private String subject;

  public Teacher(String name, String department, int age, double salary, String subject){
    super(name, department, age);

    this.teacherID = ++IDGen;
    this.salary = salary;
    this.subject = subject;
  }

  public double getSalary(){
    return salary;
  }

  public String getSubject(){
    return subject;
  }

  public int getTeacherID(){
    return teacherID;
  }

  public void setSalary(double salary){
    this.salary = salary;
  }

  public void setSubject(String subject){
    this.subject = subject;
  }

  public String toString(){
    return "teacherID: " + teacherID + ", name: " + getName() + ", age: " + getAge() + ", department: " + getDepartment() + ", subject: " + getSubject() + ", salary: " + getSalary();
  }
}
