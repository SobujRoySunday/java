public class Account{
  String account_no;
  double balance;
  Date updatedAt;

  Account(String account_no, double balance){
    this.account_no = account_no;
    this.balance = balance;
    this.updatedAt = new Date(2024, 8,1);
  }

  public Transaction deposit(double amount){
    balance += amount;
    System.out.println("Amount deposited " + amount + " to account " + account_no + " balance is " + balance);
    return new Transaction(new Date(2024, 8,1), amount, account_no, "deposit");
  }

  public Transaction withdraw(double amount){
    if(balance >= amount){
      balance -= amount;
      System.out.println("Amount withdrawn " + amount + " from account " + account_no + " balance is " + balance);
      return new Transaction(new Date(2024, 8,1), amount, account_no, "withdraw");
    } else{
      System.out.println("Insufficient balance");
      return null;
    }
  }

  public String toString(){
    return "Account number " + account_no + " balance " + balance;
  }

}