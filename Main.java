public class Main{
    public static void main(String[] args){
        Animal cow = new Animal(2);
        Animal sheep = new Animal("Sheep");

        System.out.println(cow);
        System.out.println(sheep);

        sheep.sortByAge(3);
        cow.sortByAnimal("Cow");
    }
}