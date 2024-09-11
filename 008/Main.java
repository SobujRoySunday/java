public class Main{
  Student[] studentArr = new Student[10];
  public static void main(String[] args){
    // Create new student
    studentArr[0] = new Student(1, "Sorbopriyo", "CSE", new double[]{1.0, 2.0, 3.0, 4.0, 5.0});

    // Change name
    studentArr[0].changeName("Sobuj");

    System.out.println(studentArr[0]);
  }
}