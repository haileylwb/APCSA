public class Animal{
    //inst var
    private int age;
    private String animal;

    //constructors
    public Animal(int a){
        age = a;
    }
    public Animal(String an){
        animal = an;
    }

    //methods
    public void sortByAge(int a){
        age = a;
        if(a > 1){
            System.out.println("Move to the front");
        } else {
            System.out.println("Move to the back");
        }
    }
    public void sortByAnimal(String an){
        animal = an;
        if(an == "Cow"){
            System.out.println("Move to the left");
        } else {
            System.out.println("Move to the right");
        }
    }
}
