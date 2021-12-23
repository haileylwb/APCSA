/*
Compose a class with:
At least one static accessor.
At least one static mutator.
At least one public static variable.
At least one private static variable.
In another class, invoke a static method using the class name and the dot operator.
*/

class Main {
  public static void main(String[] args) {
    CandyCane myCandyCane = new CandyCane(); //makes a new candycane
    CandyCane mrHolmersLostCandyCane = new CandyCane();
    CandyCane candyCaneIFoundOnTheFloor = new CandyCane(0);
    CandyCane candyCaneFromIkea = new CandyCane(2);
    System.out.println(CandyCane.candyCanes); //prints out how many candycanes are in the class
  }
}
