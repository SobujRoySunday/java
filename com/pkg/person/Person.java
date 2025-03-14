package com.pkg.person;

public abstract class Person {
  private String name;
  private String department;
  private int age;

  public Person(String name, String department, int age){
    this.name = name;
    this.department = department;
    this.age = age;
  }

  public String getName(){
    return name;
  }

  public String getDepartment(){
    return department;
  }

  public int getAge(){
    return age;
  }

  public void setName(String name){
    this.name = name;
  }

  public void setDepartment(String department){
    this.department = department;
  }

  public void setAge(int age){
    this.age = age;
  }
}
