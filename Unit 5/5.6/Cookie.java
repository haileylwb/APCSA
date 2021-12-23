public class Cookie{
  private int size;
  private boolean hasNuts;
  private Nut nut;

  public Cookie(){}

  public Cookie(Nut nut){
    this.nut = nut;
  }
   
  public String toString(){
    return "Size: " + size + " Nut: " + nut;
  }
  
  public void removeNuts(){
    nut = null;
  }

  public void addNuts(Nut n){
    nut = n;
  }

  public int getSize(){
    return size;
  }

  public boolean getNuts(){
    return hasNuts;
  }

  public void makeLowFat(Nut n){
    n.makeLowFat();
  }

  public void makeLowFat(){
    nut.makeLowFat();
  }

  public String moreCal(Nut a, Nut b){
    if (a.getCal() > b.getCal()) {
      return a.getName() + " has more calories";
    } else if (a.getCal() < b.getCal()) {
      return b.getName() + " has more calories";
    } else {
      return "They have the same amount of calories";
    }
  }
  
  public String hasCal(Nut n) {
    if (n.getCal() > 0) {
      return "This has calories";   
    } else {
      return "This doesn't have calories";
    }
  }
  
  public String fatNut(Nut n){
    return "If I make this nut extra nutty, it will have " + (n.getCal() + 100) + " calories. But if I dont, then it is only " + n.getCal() + " calories.";
  }

  
}

