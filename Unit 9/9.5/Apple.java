public class Apple extends Fruit{
  
  public Apple(){
    super(10);
    System.out.println("Your apple has a weight of 10");
  }
  public Apple(int i){
    super(i);
    System.out.println("Your apple has a weight of " + i);
  }

  public void die(){
    super.die();
  }
  public void whatsThis(Fruit f){
    f.getWeight();
  }
}
