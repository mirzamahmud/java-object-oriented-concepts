package mirza.java.objectoriented.concepts;

public class WaysToInitializeObject {
    public void byReferenceVariable(){
        Student student = new Student();

        student.studentName = "Afsana Akter";
        student.studentId = 17182103189L;
        student.studentAge = 24;

        System.out.println("--------- Initialize Objects by reference variable -----------");
        System.out.println("Student Name: " + student.studentName);
        System.out.println("Student ID: " + student.studentId);
        System.out.println("Student Age: " + student.studentAge);
    }

    public void byMethod(){
        Employee employee = new Employee();

        System.out.println("--------- Initialize Objects by method -----------");
        employee.employeeInformation("Hachibul Islam", "40000 BDT", 1251L);
        employee.displayEmployeeInfo();
    }

    public void byConstructor(){
        Teacher teacher = new Teacher("Sahbazz", "Discrete Mathematics", 35);

        System.out.println("--------- Initialize Objects by constructor -----------");
        teacher.displayTeacherInfo();
    }
}
