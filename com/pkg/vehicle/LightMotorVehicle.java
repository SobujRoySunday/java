// LightMotorVehicle.java

package com.pkg.vehicle;

import com.pkg.vehicle.Vehicle;

public class LightMotorVehicle extends Vehicle{
  private double mileage;

  public LightMotorVehicle(String companyName, double price, double mileage){
    super(companyName, price);
    this.mileage = mileage;
  }

  public double getMileage(){
    return mileage;
  }

  public void setMileage(double mileage){
    this.mileage = mileage;
  }

  public String toString(){
    return super.toString() + ", Mileage: " + mileage;
  }
}
