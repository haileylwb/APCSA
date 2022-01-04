class Main {
  public static void main(String[] args) {
    IceCube ice = new IceCube(10);
    IceTray tray = new IceTray();
    ice.meltIce();
    System.out.println(ice.getSize());
    tray.freeze();
    System.out.println(tray.getIce());
  }
}
