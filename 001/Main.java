public class Main{
  public static void main(String[] args){
    Calculator c = new Calculator();
    System.out.println(c.add(11,12));
    System.out.println(c.add(11,12,13));
    System.out.println(c.add(11,12,13,14));
    System.out.println(c.multiply(11,12));
    System.out.println(c.multiply(11,12,13));
    System.out.println(c.multiply(11,12,13,14));
  }
}