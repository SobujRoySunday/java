public class Complex{
  double real;
  double imaginary;
  public Complex(double real, double imaginary){
    this.real = real;
    this.imaginary = imaginary;
  }
  public void add(Complex a){
    this.real += a.real;
    this.imaginary += a.imaginary;
  }

  static public Complex add(Complex a, Complex b){
    Complex c = new Complex(a.real + b.real, a.imaginary + b.imaginary);
    return c;
  }

  public String toString(){
    return real + " + " + imaginary + "i";
  }
}