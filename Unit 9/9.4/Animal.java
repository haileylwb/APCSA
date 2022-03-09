public class Animal{
  private int numLegs = 0;
  public Animal(){
    numLegs = 4;
    System.out.println("The animal has 4 legs");
  }
  public Animal(int l){
    numLegs = l;
    System.out.println("The animal has " + l + " legs");
  }
  public void noise(){
    System.out.println("animal noises");
  }
  public void noise(String n){
    System.out.println(n);
  }
}
