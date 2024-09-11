// HeaveyMotorVehicle.java

package com.pkg.vehicle;

import com.pkg.vehicle.Vehicle;

public class HeavyMotorVehicle extends Vehicle{
  private double capacityInTons;

  public HeavyMotorVehicle(String companyName, double price, double capacityInTons){
    super(companyName, price);
    this.capacityInTons = capacityInTons;
  }

  public double getCapacityInTons(){
    return capacityInTons;
  }

  public void setCapacityInTons(double capacityInTons){
    this.capacityInTons = capacityInTons;
  }

  public String toString(){
    return super.toString() + ", Capacity: " + capacityInTons;
  }
}