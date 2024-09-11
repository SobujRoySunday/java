package com.pkg.account;

import java.util.Scanner;
import com.pkg.account.SavingsAccount;
import com.pkg.account.LoanAccount;

public class TestMain {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    SavingsAccount[] savingsAccounts = new SavingsAccount[3];
    LoanAccount[] loanAccounts = new LoanAccount[2];
    
    savingsAccounts[0] = new SavingsAccount("Sorbopriyo Roy", "Chotonilpur, Burdwan", "GFX160804", "2564 1478 9523 4153", 10000);
    savingsAccounts[1] = new SavingsAccount("Rima Raj", "Gaya, Bihar", "GFX250703", "9587 4875 1458 7546", 50000);
    savingsAccounts[2] = new SavingsAccount("Deepshikha Kumari", "Gaya, Bihar", "GFX040804", "4587 9652 4815 2375", 25000);

    loanAccounts[0] = new LoanAccount("Deepshikha Kumari", "Gaya, Bihar", "GFX040804", "4587 9652 4815 2375", 55000, 5500);
    loanAccounts[1] = new LoanAccount("Aditya Shaw", "Shyamnagar", "GFX457851", "8754 2641 5963 7485", 55000, 2000);

    System.out.println("---------------------------------------------");
    System.out.println("--------------Savings Accounts---------------");
    System.out.println("---------------------------------------------");
    System.out.println(savingsAccounts[0]);
    System.out.println(savingsAccounts[1]);
    System.out.println(savingsAccounts[2] + "\n\n");
    
    savingsAccounts[0].deposit(652);
    System.out.println(savingsAccounts[0]);
    savingsAccounts[1].withdraw(124);
    System.out.println(savingsAccounts[1] + "\n\n");

    System.out.println("---------------------------------------------");
    System.out.println("--------------Loan Accounts---------------");
    System.out.println("---------------------------------------------");
    System.out.println(loanAccounts[0]);
    System.out.println(loanAccounts[1] + "\n\n");
    
    loanAccounts[0].monthlyPay();
    System.out.println(loanAccounts[0]);

    sc.close();
  }
}
