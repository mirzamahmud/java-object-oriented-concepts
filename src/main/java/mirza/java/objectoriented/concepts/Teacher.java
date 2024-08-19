package mirza.java.objectoriented.concepts;

public class Teacher {
    String teacherName;
    String subject;
    int teacherAge;

    Teacher(String teacherName, String subject, int teacherAge){
        this.teacherName = teacherName;
        this.subject = subject;
        this.teacherAge = teacherAge;
    }

    public void displayTeacherInfo(){
        System.out.println("Teacher Name: " + teacherName);
        System.out.println("Subject: " + subject);
        System.out.println("Teacher Age: " + teacherAge);
    }
}
