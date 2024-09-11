public class Main{
  public static void main(String[] args){
    Complex c1 = new Complex(12,2);
    Complex c2 = new Complex(15,3);
    c1.add(c2);
    System.out.println(c1);
    Complex c3 = Complex.add(c1, c2);
    System.out.println(c3);
  }
}