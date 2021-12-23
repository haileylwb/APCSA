public class CandyCane{
  private int cost;
  public static int candyCanes; //public static variable
  private static int totalCost; //private static variable

  public CandyCane(){ //static mutator
    candyCanes++;
  }
  
  public CandyCane(int cost){
    this.cost = cost;
    candyCanes++;
    totalCost+=cost;
  }

  public int getTotalCost(){ //static accessor
    return totalCost;
  }
}
