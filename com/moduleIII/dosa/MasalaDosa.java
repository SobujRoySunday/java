package com.moduleIII.dosa;

public class MasalaDosa implements Dosa{
  private String myDosa = "Masala Dosa";
  
  public void decorate(){
    myDosa += " with masala curry";
  }

  public String toString(){
    return myDosa;
  }
}
