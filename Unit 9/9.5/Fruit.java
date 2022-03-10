public class Fruit{
  private int weight = 0;
  
  public Fruit(){
    weight = 5;
  }
  public Fruit(int i){
    weight = i;
  }

  public void die(){
    System.out.println("Your fruit died");
  }
  public int getWeight(){
    return weight;
  }
}
