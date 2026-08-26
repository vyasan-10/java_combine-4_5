abstract class Employee {
    private int id;
    private String name;

    public Employee(int id, String name) {
        this.id = id;
        this.name = name;
    }
    public int getId() {
        return id;
    }
    public String getName() {
        return name;
    }
    public abstract double calculatePay();

}

class FulltimeEmployee extends Employee {
    private double monthlySalary;

    public FulltimeEmployee(int id, String name, double monthlySalary) {
        super(id, name);
        this.monthlySalary = monthlySalary;
    }

    @Override
    public double calculatePay() {
        return monthlySalary;
    }
}

class ContractEmployee extends Employee {
    private double hoursWorked;
    private double hourlyRate;

    public ContractEmployee(int id, String name, double hoursWorked, double hourlyRate){
        super(id, name);
        this.hoursWorked = hoursWorked;
        this.hourlyRate = hourlyRate;
    }

    @Override
    public double calculatePay(){
        return hoursWorked * hourlyRate;
    }
}

class InternEmployee extends Employee {
    private double stipend;

    public InternEmployee(int id, String name, double stipend) {
        super(id, name);
        this.stipend = stipend;
    }

    @Override
    public double calculatePay() {
        return stipend;
    }
}

public class PayrollSystem {

    public static void main(String[] args) {
        Employee[] employees = new Employee[3];

        employees[0] = new FulltimeEmployee(1, "Santhosh", 50000.0);
        employees[1] = new ContractEmployee(2, "Kannan", 160, 50.0);
        employees[2] = new InternEmployee(3, "Ramesh", 10000.0);

        for (Employee employee : employees) {
            System.out.println("Employee ID:" + employee.getId());
            System.out.println("Employee Name:" + employee.getName());
            System.out.println("Pay: $" + employee.calculatePay());
            System.out.println();
        }
    }
}