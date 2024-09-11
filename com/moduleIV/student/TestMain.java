package com.moduleIV.student;

public class TestMain {
  public static void main(String[] args) {
    Student s1 = new Student("Sorbopriyo Roy", 25);
    System.out.println(s1);
    try {
      s1.setScore(60);
      System.out.println(s1);
    } catch (InvalidScoreException e) {
      System.out.println("You are setting an invalid score");
    }
    try {
      s1.setScore(1000);
      System.out.println(s1);
    } catch (InvalidScoreException e) {
      System.out.println("You are setting an invalid score");
    }
  }
}
