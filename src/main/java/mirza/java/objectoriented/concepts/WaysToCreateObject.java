package mirza.java.objectoriented.concepts;

public class WaysToCreateObject {

    // The most common way to create an object in Java is by using the new keyword.
    public void usingNewKeyword(){
        System.out.println("--------- Create Object by using new keyword -----------");

        Dog dog = new Dog("Tintin");
        dog.bark();
    }

    // use reflection to create an instance of a class.
    public void usingNewInstanceMethod(){
        System.out.println("--------- Create Object by using newInstance() method -----------");

        try {
            Dog dog = Dog.class.getDeclaredConstructor(String.class).newInstance("Rex");
            dog.bark();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    // create a copy of an existing object using the clone() method.
    // The class must implement the Cloneable interface.
    public void usingCloneMethod(){
        System.out.println("--------- Create Object by using clone() method -----------");

        try {
            Dog dog = new Dog("Max");
            Dog clonedDog = (Dog) dog.clone();
            clonedDog.bark();  // Output: Max is barking
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
    }
}
