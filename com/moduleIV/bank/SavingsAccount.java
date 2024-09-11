package com.moduleIV.bank;

public class SavingsAccount extends Account{
  private double interestRate = 0.05;

  public SavingsAccount(String name){
    super(name);
  }

  public void compoundInterest(){
    double compound = this.getBalance()*interestRate;
    this.setBalance(compound + this.getBalance());
    System.out.println(compound + "$ added to your account.");
    this.printBalance();
  }
}
