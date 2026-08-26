class Employee {
    public double calculateSalary() {
        return 0.0;
    }
}

class Manager extends Employee {
    public double calculateSalary() {
        return 80000.0;
    }
}

class Developer extends Employee {
    public double calculateSalary() {
        return 60000.0;
    }
}

class Intern extends Employee {
    public double calculateSalary() {
        return 20000.0;
    }
}

public class DemoEmployee {
    public static void main(String[] args) {
        Employee e1 = new Manager();
        Employee e2 = new Developer();
        Employee e3 = new Intern();

        System.out.println("Manager Salary: " + e1.calculateSalary());
        System.out.println("Developer Salary: " + e2.calculateSalary());
        System.out.println("Intern Salary: " + e3.calculateSalary());
    }
}