class Employee {
    String name;
    double salary;

    Employee(String n, double s) {
        name = n;
        salary = s;
        System.out.println("Employee Name : " + name + " Employee Salary : " + salary);
    }
}

public class EmployeeDemo {
    public static void main(String[] args) {
        Employee e = new Employee("Rahul", 35000);
    }
}
