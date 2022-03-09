public class Fish extends Animal{
  private int length = 0;
  public Fish(){
    length = 5;
  }
  public Fish(int i){
    super(i);
  }
  public void noise(String s){
    super.noise(s);
  }
} 
