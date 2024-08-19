package mirza.java.objectoriented.concepts;

public class Dog implements Cloneable{
    String name;

    Dog(String name){
        this.name = name;
    }

    public void bark(){
        System.out.println(name + " " + "is barking");
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}
