public class Main{
    public static void main(String[] args){
        //invoking string constructor
        String greeting = new String("Hi ");
        String name = "abc";
        String name2 = "def";

        System.out.println(greeting + name); //+
        System.out.println(greeting += name2); //+=
        System.out.println(greeting + 1); //prim values
        System.out.println(greeting + 2 + 3);
        System.out.println("Welcome\nAnd Farewell"); //escape \n
        System.out.println("\"you smell funny\" -not me"); //escape \
        System.out.println("\\"); //escape \\
    }
}
