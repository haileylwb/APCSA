public class Plant{
  protected double age;
  private static int plants;
  public Plant(double a){
    age = a;
  }
  public double getAge(){
    return age;
  }
  public void shed(){
    System.out.println("A leaf falls..");
  }
}
