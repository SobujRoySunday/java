package com.moduleIII.dosa;

public class OnionDosa implements Dosa{
  private String myDosa = "Onion Dosa";

  public void decorate(){
    myDosa += " with onion scraps";
  }

  public String toString(){
    return myDosa;
  }
}
