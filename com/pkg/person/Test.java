package com.pkg.person;

import com.pkg.person.Student;
import com.pkg.person.Teacher;
import java.util.Scanner;

public class Test {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    Teacher[] teachers = new Teacher[3];
    
    teachers[0] = new Teacher("Dr. Satyabrata Maity", "Information Technology", 40, 100000, "Data Structures & Algorithms");
    teachers[1] = new Teacher("Dr. Nirmalya Sundar Maity", "Information Technology", 45, 100000, "Compiler Design");
    teachers[2] = new Teacher("Dr. Kamalesh Karmakar", "Information Technology", 38, 100000, "Object Oriented Programming");

    Student[] students = new Student[5];

    students[0] = new Student("Sorbopriyo Roy", "Information Technology", 21, 5);
    students[1] = new Student("Rima Raj", "Information Technology", 20, 5);
    students[2] = new Student("Deepshikha Kumari", "Information Technology", 20, 5);
    students[3] = new Student("Abhik Ghosh", "Information Technology", 20, 5);
    students[4] = new Student("Kaankaana Bag", "Information Technology", 21, 5);

    System.err.println("-----------------------------------------------");
    System.err.println("-------------------Teachers--------------------");
    System.err.println("-----------------------------------------------");

    for(int i = 0;i < 3;i++){
      System.out.println(teachers[i]);
    }

    System.err.println("-----------------------------------------------");
    System.err.println("-------------------Students--------------------");
    System.err.println("-----------------------------------------------");

    for(int i = 0;i < 5;i++){
      System.out.println(students[i]);
    }

    sc.close();
  }
}
