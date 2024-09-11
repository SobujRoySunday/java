public class Main{

  public static void main(String[] args){
    Account a = new Account("1234", 1000.0);
    System.out.println(a);
    Transaction t1 = a.deposit(500.0);
    Transaction t2 = a.withdraw(200.0);
    System.out.println(a);
    Transaction t3 = a.withdraw(10000);

    System.out.println(t1);
    System.out.println(t2);
    System.out.println(t3);
  }
}