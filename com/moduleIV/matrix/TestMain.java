package com.moduleIV.matrix;

import com.moduleIV.matrix.*;
import java.util.Random;
import com.moduleIV.matrix.MatrixException;;

public class TestMain {
  public static void main(String[] args) {
    Matrix m1 = new Matrix(args[0].charAt(0) - '0',args[1].charAt(0) - '0');
    for (int i = 0; i < m1.dimX; i++) {
      for (int j = 0; j < m1.dimY; j++) {
        m1.setElementAt(i, j, new Random().nextInt());
      }
    }
    m1.print();

    System.out.println("---------------------------------------------");
    
    Matrix m2 = new Matrix(args[2].charAt(0) - '0',args[3].charAt(0) - '0');
    for (int i = 0; i < m2.dimX; i++) {
      for (int j = 0; j < m2.dimY; j++) {
        m2.setElementAt(i, j, new Random().nextInt());
      }
    }
    m2.print();
    
    System.out.println("---------------------------------------------");

    try {
      m1.add(m2);
    } catch (MatrixException me) {
      me.printStackTrace();
    }
    m1.print();
  }
}
