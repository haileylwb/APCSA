public class IceTray{
  private IceCube ice;

  public IceTray(){
    ice = new IceCube(0);
  }
  public IceCube getIce(){
    return ice;
  }
  public void setIce(int iceSize){
    IceCube ice = new IceCube(iceSize);

    ice.setIceTray(this);
  }

  public void freeze(){
    ice.freeze(this);
  }
}
