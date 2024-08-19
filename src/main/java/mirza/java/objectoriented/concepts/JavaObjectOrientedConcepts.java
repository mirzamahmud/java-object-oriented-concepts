package mirza.java.objectoriented.concepts;

public class JavaObjectOrientedConcepts {
    public static void main(String[] args){
        // creating an object and instance of ObjectAndClass
        ObjectAndClass objectAndClass = new ObjectAndClass();

        // accessing member through reference variable
        objectAndClass.studentName = "Mirza Mahmud Hossan";
        objectAndClass.studentId = 17182103202L;
        objectAndClass.studentAge = 25;

        //Printing values of the object
        System.out.println("Student Name: " + objectAndClass.studentName);
        System.out.println("Student ID: " + objectAndClass.studentId);
        System.out.println("Student Age: " + objectAndClass.studentAge);
    }
}
