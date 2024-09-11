package com.moduleIV.matrix;

import com.moduleIV.matrix.MatrixException;

public class Matrix {
  int dimX, dimY;
  private int data[][];

  public Matrix(int i, int j){
    this.dimX = i;
    this.dimY = j;
    this.data = new int[dimX][dimY];
  }

  public int getElementAt(int i, int j){
    return data[i][j];
  }

  public void setElementAt(int i, int j, int value){
    data[i][j] = value;
  }

  public void add(Matrix m2) throws MatrixException{
    if(dimX == m2.dimX && dimY == m2.dimY){
      for (int i = 0; i < dimX; i++) {
        for (int j = 0; j < dimY; j++) {
          this.data[i][j] += m2.data[i][j];
        }
      }
    } else {
      throw new MatrixException();
    }
  }

  public void print(){
    for (int i = 0; i < dimX; i++) {
      for (int j = 0; j < dimY; j++) {
        System.out.print(" " + data[i][j]);
      }
      System.out.println();
    }
  }
}
