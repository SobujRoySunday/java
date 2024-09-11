public class Book{
  private String title;
  private String author;
  private int stock;

  public Book(String title, String author, int stock){
    this.title = title;
    this.author = author;
    this.stock = stock;
  }

  public Book(Book b){
    this(b.title, b.author, b.stock);
  }

  public String toString(){
    return title + " " + author + " " + stock;
  }

  void purchase(){
    stock--;
    System.out.println("Book purchased: " + title);
  }
  
}