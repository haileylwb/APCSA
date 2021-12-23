public class Nut{
  private String name;
  private int calories;

  public Nut(String s, int c){
    this.name = s;
    this.calories = c;
  }

  public String getName(){
    return name;
  }

  public int getCal(){
    return calories;
  }

  public void makeLowFat(){
    calories -= 100;
  }

  public String toString(){
    return name + " has " + calories + " calories";
  }

}
