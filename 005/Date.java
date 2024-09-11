public class Date{
  int year;
  int month;
  int day;

  Date(int year, int month, int day){
    this.year = year;
    this.month = month;
    this.day = day;
  }

  public String toString(){
    return year + "/" + month + "/" + day;
  }
}