package com.moduleIV.account;

public class LoanAccount extends Account {
  private double totalLoanAmount;
  private static double interestRate = 0.05;
  private double monthlyPayment;
  private double totalPayment;
  private int loanPeriod;
  private boolean isOpen = true;
  private double overdraftLimit = 100.0;

  public LoanAccount(String name, String address, String pan, String addressProofIdentity, double totalLoanAmount, double monthlyPayment) {
    super(name, address, pan, addressProofIdentity);
    this.totalLoanAmount = totalLoanAmount;
    this.monthlyPayment = monthlyPayment;
    this.totalPayment = 0.0;
    this.loanPeriod = (int)(totalLoanAmount / monthlyPayment);
  }

  public double getMonthlyPayment() {
    return monthlyPayment;
  }

  public double getTotalPayment() {
    return totalPayment;
  }
  
  public double getInterestRate() {
    return interestRate;
  }
  
  public double getTotalLoanAmount() {
    return totalLoanAmount;
  }
  
  public boolean isOpen(){
    return isOpen;
  }

  public void monthlyPay(){
    if(isOpen){
      double pay = monthlyPayment + (totalLoanAmount * interestRate);
      totalPayment += pay;
      loanPeriod--;
      if(loanPeriod == 0) isOpen = false;
      System.out.println("Monthly payment for this month is " + pay + " and " + loanPeriod + " months left");
    } else{
      System.out.println("Loan is closed");
    }
  }

  public void setInterestRate(double interestRate){
    LoanAccount.interestRate = interestRate;
  }

  public void grabMoreMoney(double money){
    try {
      if(money < overdraftLimit){
        overdraftLimit -= money;
        totalLoanAmount += money;
        System.out.println("You grabbed " + money + " amount.");
      } else{
        throw new OverdraftLimitException();
      }
    } catch (OverdraftLimitException e) {
      System.out.println("Your overdraft limit has beed exhausted.");
    }
  }
 
  public String toString(){
    return super.toString() + " totalLoanAmount: " + totalLoanAmount + ", monthlyPayment: " + monthlyPayment + ", totalPayment: " + totalPayment + ", loanPeriod: " + loanPeriod + ", isOpen: " + isOpen;
  }
}
