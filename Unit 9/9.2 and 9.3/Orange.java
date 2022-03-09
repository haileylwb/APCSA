public class Orange extends Fruit{
  private int size = 0;
  public Orange(){
    size = 5;
    System.out.println("The orange has a size of 5 units");
  }
  public Orange(String s){
    super(s);
  }
  public Orange(String s, int i){
    super(s);
    size = i;
    System.out.println("The orange has a size of " + i + " units");
  }
  public void decay(){
    System.out.println("The fruit is rotten :(");
  }
}
