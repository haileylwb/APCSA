// Write a class that contains at least two non-void methods, at least one with parameters and one without.

public class Cookie{
    //inst var
    private int size;
    private boolean eaten;
    private String flavor;

    //constructor
    public Cookie(int s, String f){
        size = s;
        flavor = f;
    }
    public Cookie(int s, boolean e, String f){
        size = s;
        eaten = e;
        flavor = f;
    }

    //non void methods
    public int cut(int s){
        size += s;
        return size;
    }

    public boolean bite(){
        eaten = true;
        return true;
    }
}
