public class IceCube{
  private int size;
  private IceTray iceTray;
  
  public IceCube(int size){
    this.size = size; 
  }
  public void meltIce(){
    size--;
  }
  public int getSize(){
    return size;
  }
  public void setIceTray(IceTray iceTray){
    this.iceTray = iceTray;
  }
  public void freeze(IceTray i){
    size++;
  }
  public String toString(){
    return "Cubes: "  + size;
  }
} 
