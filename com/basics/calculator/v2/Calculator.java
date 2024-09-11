public class Calculator{
  public int add(int ...a){
    int sum = 0;
    for(int i:a){
      sum += i;
    }
    return sum;
  }

  public int multiply(int ...a){
    int mul = 1;
    for(int i:a){
      mul *= i;
    }
    return mul;
  }
}