package com.moduleIV.arithmatic;

import java.util.Random;

public class RandomFor {
  public int loop(int n){
    try {
      for (int i = 0; i < n; i++) {
        int random = new Random().nextInt();
        int rem = random % 10;
        if(rem > 5){
          throw new ArithmeticExcepton(i);
        }
      }
      return -1;
    } catch (ArithmeticExcepton e) {
      return e.it;
    }
  }
}
