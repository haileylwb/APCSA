import java.util.*;

class Main {
  public static void print(Fruit f){
    System.out.println(f + " is a fruit");
  }
  public static void main(String[] args) {
    Apple a = new Apple();
    a.die();

    Fruit f = new Fruit(3);
    Fruit ff = new Apple();

    Fruit fruits[] = new Fruit[2];
    fruits[0] = a;
    fruits[1] = f;
    
    ArrayList<Fruit> fruits2 = new ArrayList<Fruit>();
    fruits2.add(a);
    fruits2.add(f);

    print(a);
  }
}
