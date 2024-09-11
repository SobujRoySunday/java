package com.moduleIV.bank;

public abstract class Account{
  private static int idGen = 0;
  private String name;
  private int accountNo;
  private String typeOfAccount = "Account";
  private double balance = 0.0;

  public Account(String name){
    this.name = name;
    this.accountNo = ++idGen;
  }

  public String getName(){
    return name;
  }

  public int getAccountNo(){
    return accountNo;
  }

  public String getTypeOfAccount(){
    return typeOfAccount;
  }

  public double getBalance(){
    return balance;
  }

  public void setName(String name){
    this.name = name;
  }

  public void setBalance(double money){
    balance = money;
  }

  public void deposit(double money){
    balance += money;
  }

  public void withdraw(double money){
    try {
      if(balance < money) throw new NoBalanceException();
    } catch (NoBalanceException e) {
      System.out.println("You have not enough balance to withdraw");
    }
  }

  public void printBalance(){
    System.out.println("Your account balance is: " + balance + "$");
  }
}
