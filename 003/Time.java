public class Time{
  int hour;
  int minute;
  int second;

  Time(){
    hour = 0;
    minute = 0;
    second = 0;
  }

  Time(int hour, int minute, int second){
    this.hour = hour;
    this.minute = minute;
    this.second = second;
  }

  public String toString(){
    if(hour < 13){
      return hour + ":" + minute + ":" + second + " AM";
    } else{
      return (hour - 12) + ":" + minute + ":" + second + " PM";
    }
  }
}