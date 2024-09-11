package com.moduleIV.student;

public class Student {
  private static int rollGen = 0;
  private int roll;
  private String name;
  private double score;

  public Student(String name, double score){
    this.name = name;
    this.score = score;
    this.roll = ++rollGen;
  }

  public void setScore(double score) throws InvalidScoreException{
    if(score < 0 || score > 100){
      throw new InvalidScoreException();
    } else {
      this.score = score;
    }
  }

  public String toString(){
    return "Name: " + name + ", Roll: " + roll + ", Score: " + score;
  }
}
