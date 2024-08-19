package mirza.java.objectoriented.concepts;

public class Employee {
    String employeeName;
    String employeeSalary;
    long employeeId;

    public void employeeInformation(String employeeName, String employeeSalary, long employeeId){
        this.employeeName = employeeName;
        this.employeeSalary = employeeSalary;
        this.employeeId = employeeId;
    }

    public void displayEmployeeInfo(){
        System.out.println("Employee Name: " + employeeName);
        System.out.println("Employee Salary: " + employeeSalary);
        System.out.println("Employee Id: " + employeeId);
    }
}
