public class Fruit{
  private String color = "";
  public Fruit(){
    color = "green";
    System.out.println("You can't eat this yet!");
  }
  public Fruit(String c){
    color = c;
    System.out.println("Color: " + c);
  }
  public void changeColor(){
    System.out.println("The fruit is changing color!");
  }
  public void decay(){
    System.out.println("The fruit is rotten :(");
  }
}
