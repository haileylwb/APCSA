class Main {
  public static void main(String[] args) {
    //Includes a method that modifies a mutable object passed as a parameter.
    Nut peanut = new Nut("Peanut", 200);
    Cookie cookie = new Cookie(peanut);
    cookie.makeLowFat();
    System.out.println(cookie);

    Cookie otherCookie = new Cookie();
    otherCookie.makeLowFat(peanut);
    System.out.println(peanut);
    
    //Includes a non-void method that receives values through a parameter and uses those values.    
    Nut treenut = new Nut("Treenut", 150);
    Cookie mysteryCookie = new Cookie(treenut);
    Nut stolenNut = new Nut("Unknown", 200);
    System.out.println(mysteryCookie.moreCal(treenut, stolenNut));

    //Includes a method that does not modify mutable objects passed as a parameter.
    System.out.println(cookie.hasCal(peanut));
    
    //method that demonstrates that changes to a formal parameter have no effect on the actual parameter
    System.out.println(cookie.fatNut(peanut));
  }
}

