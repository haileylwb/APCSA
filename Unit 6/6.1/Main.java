class Main {
  public static void main(String[] args) {
    //array of three relevant primitive types
    int[] array = new int[5];
    double[] doubleArray = {1.1, 2.2, 3.4};
    boolean[] bool = new boolean[3];

    //array of strings
    String[] strings = {"meow", "moo", "ploo"};

    //array of mutable objects 
    ToiletPaper[] flavoredToiletPaper = {new ToiletPaper(36), new ToiletPaper(42)};
          
    //array with non-default values
    int[] array2 = {1, 2, 3};

    //array with initializer list
    double[] doubleArray2 = {1.10, 2.20, 3.40};

    //accessing an element of an array
    System.out.println(doubleArray[0]); //prints 1.1

    //modifying an element of an array
    doubleArray[2]-=0.1; //changes 3.4 to 3.3
    System.out.println(doubleArray[2]);

    //this throws a ArrayIndexOutOfBoundsException
    //commented out to test other code - this does work tho :>
    //System.out.println(array[40]);
  }
}
