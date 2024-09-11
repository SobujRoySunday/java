package com.moduleIII.dosa;

public class TestMain {
  /*
   * SwathiDosaCorner is a famous restaurant and large number of people order various types of
      Dosas. There are two types of Dosas available with the restaurant, namely MasalaDosa and
      OnionDosa. MasalaDosa is decorated with masala curry, whereas OnionDosa is decorated with
      onion scrap. Explain how interfaces can be used to simulate the scenario to pre different dosas
      on the request from the client. Illustrate polymorphism involved in this application.
   */

   public static void main(String[] args) {
      MasalaDosa md = new MasalaDosa();
      System.out.println(md);
      md.decorate();
      System.out.println(md + "\n");

      OnionDosa od = new OnionDosa();
      System.out.println(od);
      od.decorate();
      System.out.println(od);
   }
}
