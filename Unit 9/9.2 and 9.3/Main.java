class Main {
  public static void main(String[] args) {
    Orange o = new Orange("Orange", 8);
    Orange o2 = new Orange();
    Fruit f = new Fruit("Green");
    o.decay();
    f.decay();
    o.changeColor();
    f.changeColor();
  }
}

/*
9.2
Call a superclass constructor using the keyword super and pass actual parameters.
Call a superclass's no-argument constructor.

9.3
Override at least one method.  Call that method on a superclass object and a subclass object.
Call a method that exists in a superclass but not a subclass on a subclass object.
Call a method that exists in a superclass but not a subclass on a superclass object.
*/
