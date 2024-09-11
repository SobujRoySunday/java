package com.pkg.person;

import com.pkg.person.Person;;

public class Student extends Person{
  private int IDGen = 0;
  private int studentID;
  private int semester;

  public Student(String name, String department, int age, int semester){
    super(name, department, age);

    this.studentID = ++IDGen;
    this.semester = semester;
  }

  public int getStudentID(){
    return studentID;
  }

  public int getSemester(){
    return semester;
  }

  public void setSemeter(int semester){
    this.semester = semester;
  }

  public String toString(){
    return "studentID: " + studentID + ", name: " + getName() + ", age: " + getAge() + ", department: " + getDepartment() + ", semester: " + getSemester();
  }
}
