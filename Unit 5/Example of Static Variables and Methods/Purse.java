public class Purse{
  private static int num;
  public static double avgPrice;
  private double volume;

  public static void increment(){
    num++;
  }
  private static String avg(){
    return "the avg price is" + avgPrice;
  }
  public int add(int a){
    int volume = 7; //local var - cant declare private / public
    String material = "Leather";
    return volume; 
  }
  public double getVolume(){
    return volume;
  }
  //cannot do this
//   public void setMaterial(String mat){
//     material = mat; 
//   }
}
  
  //Purse lv = new Purse();
  //lv.getVolume <- print this
//lv.add(3) <- print this, prints 7
