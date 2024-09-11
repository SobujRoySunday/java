package com.moduleIII.filter;

import com.moduleIII.filter.*;

public class TestMain {
  public static void main(String[] args) {
   CharacterFilter cf = new CharacterFilter(args);
   NumberFilter nf = new NumberFilter();
   String myString = "eirgbeargbwscvb8342bweb3h2b3#$%@";
   System.out.println("No filter: " + myString);
   myString = cf.filter(myString);
   System.out.println("CharacterFilter: " + myString);
   myString = nf.filter(myString);
   System.out.println("NumberFilter: " + myString);
  }
}
