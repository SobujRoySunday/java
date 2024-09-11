package com.moduleIV.bank;

public class TestMain {
  public static void main(String[] args) {
    SavingsAccount sa = new SavingsAccount("Sobuj");
    CurrentAccount ca = new CurrentAccount("Deep");
    sa.deposit(500);
    sa.printBalance();
    sa.compoundInterest();
    sa.withdraw(100);
    sa.printBalance();
    sa.withdraw(5000);
    sa.printBalance();
  
    System.out.println();

    ca.deposit(45);
    ca.printBalance();
    ca.imposeServiceCharge();
    ca.deposit(500);
    ca.printBalance();
    ca.imposeServiceCharge();
  }
}
