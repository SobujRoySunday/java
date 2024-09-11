public class Transaction{
  Date date;
  double amount;
  String account_no;
  String transactionType;

  public Transaction(Date date, double amount, String account_no, String transactionType){
    this.date = date;
    this.amount = amount;
    this.account_no = account_no;
    this.transactionType = transactionType;
  }
}