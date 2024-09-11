public class CarParking{
  double totalCollection;
  int parkedCars;

  public CarParking(double totalCollection, int parkedCars){
    this.totalCollection = totalCollection;
    this.parkedCars = parkedCars;
  }

  public static double calculateFee(int hours){
    if(hours <= 2){
      return 10.0;
    } else{
      return 10.0 + (hours - 2) * 5.0;
    }
  }

  public double getTotalCollection(){
    return totalCollection;
  }

  public int getParkedCars(){
    return parkedCars;
  }

  public void addCar(Car c){
    parkedCars++;
    totalCollection += calculateFee(c.hoursOfBooking);
    System.out.println("Car parked, you are charged $" + calculateFee(c.hoursOfBooking) + ".");
  }

  public void removeCar(){
    parkedCars--;
    System.out.println("Car removed.");
  }

}