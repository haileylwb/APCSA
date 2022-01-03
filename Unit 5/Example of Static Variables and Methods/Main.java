public class Purse{
  private static int num;
  public static double avgPrice;

  public static void increment(){
    num++;
  }
  private static String avg(){
    return "the avg price is" + avgPrice;
  }
}
