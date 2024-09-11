package com.pkg.vehicle;

import java.util.Random;

public class Vehicle{
  private static int globalStaticCounter = 100001;
  private int uid;
  private String companyName;
  private double price;

  public Vehicle(String companyName, double price){
    this.uid = globalStaticCounter++;
    this.companyName = companyName;
    this.price = price;
  }

  public String getCompanyName(){
    return companyName;
  }

  public double getPrice(){
    return price;
  }

  public void setCompanyName(String companyName){
    this.companyName = companyName;
  }

  public void setPrice(double price){
    this.price = price;
  }

  public String toString(){
    return "UID: " + uid + ", Company Name: " + companyName + ", Price: " + price;
  }

}