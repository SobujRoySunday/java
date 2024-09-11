// TestMain.java

package com.pkg.vehicle;

import java.util.Scanner;
import com.pkg.vehicle.LightMotorVehicle;
import com.pkg.vehicle.HeavyMotorVehicle;

public class TestMain {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    System.out.println("Enter the type of vehicle 0 representing light and 1 representing heavy: ");
    int type = sc.nextInt();

    System.out.println("Enter the number of vehicles: ");
    int n = sc.nextInt();

    if(type == 0){
      LightMotorVehicle[] vehicles = new LightMotorVehicle[n];
      for(int i = 0;i < n;i++){
        System.out.println("Enter the company name:");
        String companyName = sc.next();
        System.out.println("Enter the price of the vehicle: ");
        double price = sc.nextDouble();
        System.out.println("Enter the mileage of the vehicle: ");
        double mileage = sc.nextDouble();
        vehicles[i] = new LightMotorVehicle(companyName, price, mileage);
      }

      for(LightMotorVehicle v : vehicles){
        System.out.println(v.toString());
      }
    } else{
      HeavyMotorVehicle[] vehicles = new HeavyMotorVehicle[n];
      for(int i = 0;i < n;i++){
        System.out.println("Enter the company name:");
        String companyName = sc.next();
        System.out.println("Enter the price of the vehicle: ");
        double price = sc.nextDouble();
        System.out.println("Enter the capacity of the vehicle: ");
        double capacity = sc.nextDouble();
        vehicles[i] = new HeavyMotorVehicle(companyName, price, capacity);
      }

      for(HeavyMotorVehicle v : vehicles){
        System.out.println(v.toString());
      }
    }

    sc.close();
  }
}
