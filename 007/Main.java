public class Main{
  public static void main(String[] args){
    Book b1 = new Book("The Catcher in the Rye", "J. D. Salinger", 10);
    b1.purchase();
    Book b2 = new Book(b);
    b2.purchase();
    System.out.println(b2);
  }
}