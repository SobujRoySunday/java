package com.moduleIV.arithmatic;

public class TestMain {
  /*
   * Write a program that calls a method that throws an exception of type ArithmeticExcepton at a
    random iteration in a for loop. Catch the exception in the method and pass the iteration count 
    when the exception occurred to the calling method by using an object of an exception class you
    define.
   */

   public static void main(String[] args) {
    RandomFor rf = new RandomFor();
    System.out.println(rf.loop(100));
   }
}
