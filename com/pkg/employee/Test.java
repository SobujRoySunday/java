package com.pkg.employee;

import com.pkg.employee.Manager;

public class Test {
  public static void main(String[] args) {
    int n = 5;
    Manager[] managers = new Manager[n];

    managers[0] = new Manager("Sorbopriyo Roy", "IT", 100000, 20000);
    managers[1] = new Manager("Abhik Ghosh", "IT", 90000, 25000);
    managers[2] = new Manager("Deepshikha Kumari", "IT", 125000, 35000);
    managers[3] = new Manager("Partha Ganguly", "Support", 62000, 7000);
    managers[4] = new Manager("Aritra Konar", "Testing", 83000, 12000);

    int indexOfMax = 0;
    for(int i = 1;i < n;i++){
      if(managers[i].getTotalSalary() > managers[indexOfMax].getTotalSalary()){
        indexOfMax = i;
      }
    }

    System.out.println(managers[indexOfMax]);
  }
}
