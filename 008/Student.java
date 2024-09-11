public class Student{
  int rollNo;
  String name;
  String course;
  double[] marks;
  
  public Student(int rollNo, String name, String course, double[] marks){
    this.rollNo = rollNo;
    this.name = name;
    this.course = course;
    this.marks = marks;
  }

  public String toString(){
    return rollNo + " " + name + " " + course + " " + marks;
  }

  void changeCourse(String course){
    this.course = course;
  }

  void changeMarks(double[] marks){
    this.marks = marks;
  }

  void changeName(String name){
    this.name = name;
  }

  void changeRollNo(int rollNo){
    this.rollNo = rollNo;
  }

  double calculateAverageMarks(){
    double sum = 0.0;
    for(int i = 0; i < marks.length; i++){
      sum += marks[i];
    }
    return sum / marks.length;
  }
} 