public class Main{
    public static void main(String[] args){
        Cookie choco = new Cookie(3, "Chocolate");
        System.out.println(choco);

        Cookie yucky = new Cookie(5, false, "Rasin");
        System.out.println(yucky);

        System.out.println(choco.cut(-1));
        System.out.println(yucky.bite());
    }
}
