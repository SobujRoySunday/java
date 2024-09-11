package com.moduleIV.account;

public class SavingsAccount extends Account {
  private double balance;

  public SavingsAccount(String name, String address, String pan, String addressProofIdentity, double balance) {
    super(name, address, pan, addressProofIdentity);
    this.balance = balance;
  }

  public double getBalance() {
    return balance;
  }

  public void deposit(double amount) {
    balance += amount;
    System.out.println("Amount deposited " + amount + " to account " + getCustomerID() + " balance is " + balance);
  }

  public void withdraw(double amount) {
    try {
      if (balance >= amount) {
        balance -= amount;
        System.out.println("Amount withdrawn " + amount + " from account " + getCustomerID() + " balance is " + balance);
      } else {
        throw new NotEnoughBalanceException();
      }
    } catch (NotEnoughBalanceException e) {
      System.out.println("You don't have enough balance");
    }
  }

  public String toString() {
    return super.toString() + ", balance: " + balance;
  }
  
}
