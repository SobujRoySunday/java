public class Main{
  public static void main(String[] args){
    Car c1 = new Car("ABC123", 10);
    Car c2 = new Car("ABC456", 1);
    CarParking cp = new CarParking(0.0, 0);
    cp.addCar(c1);
    cp.addCar(c2);
    System.out.println(cp.getTotalCollection());
    System.out.println(cp.getParkedCars());
    cp.removeCar();
    System.out.println(cp.getTotalCollection());
    System.out.println(cp.getParkedCars());
    cp.removeCar();
  }
}