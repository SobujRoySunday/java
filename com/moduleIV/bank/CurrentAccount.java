package com.moduleIV.bank;

public class CurrentAccount extends Account{
  private double serviceCharge = 1.0;
  private double minBalance = 50.0;

  public CurrentAccount(String name){
    super(name);
  }

  public void imposeServiceCharge(){
    try {
      if(this.getBalance() < minBalance){
        this.setBalance(this.getBalance() - serviceCharge);
        System.out.println(serviceCharge + "$ service charge has been applied.");
        this.printBalance();
      } else{
        throw new ServiceChargeNotApplicableException();
      }
    } catch (ServiceChargeNotApplicableException e) {
      System.out.println("This account is not applicable for service charge");
    }
  }
}
