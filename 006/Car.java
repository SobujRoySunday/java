public class Car{
  String carNo;
  int hoursOfBooking;

  public Car(String carNo, int hoursOfBooking){
    this.carNo = carNo;
    this.hoursOfBooking = hoursOfBooking;
  }

  public String toString(){
    return carNo + " " + hoursOfBooking;
  }
}