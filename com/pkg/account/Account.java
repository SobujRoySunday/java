package com.pkg.account;

public abstract class Account {
  private int customerID;
  private String name;
  private String address;
  private String pan;
  private String addressProofIdentityNumber;
  private static int IdGenerator = 0;

  public Account(String name, String address, String pan, String addressProofIdentity){
    this.customerID = IdGenerator++;
    this.name = name;
    this.address = address;
    this.pan = pan;
    this.addressProofIdentityNumber = addressProofIdentity;
  }

  public int getCustomerID(){
    return customerID;
  }

  public String getName(){
    return name;
  }

  public String getAddress(){
    return address;
  }

  public String getPan(){
    return pan;
  }

  public String getAddressProofIdentityNumber(){
    return addressProofIdentityNumber;
  }

  public void setName(String name){
    this.name = name;
  } 

  public void setAddress(String address){
    this.address = address;
  }

  public void setPan(String pan){
    this.pan = pan;
  }

  public void setAddressProofIdentityNumber(String addressProofIdentityNumber){
    this.addressProofIdentityNumber = addressProofIdentityNumber;
  }

  public String toString(){
    return "customerID: " + customerID + ", name: " + name + ", address: " + address + ", pan: " + pan + ", addressProofIdentityNumber: " + addressProofIdentityNumber;
  }

}
