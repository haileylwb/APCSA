class Main {
  public static void main(String[] args) {
    Tree p = new Tree(12);
    p.shed();
    p.grow(1.5);
    System.out.println(p.getAge());
  }
}

