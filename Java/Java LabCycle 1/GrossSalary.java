import java.util.Scanner;

public class GrossSalary {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter basic salary: ");

        double salary = sc.nextDouble();

        final double DA_RATE = 0.10;
        final double HRA_RATE = 0.15;

        double DA = salary * DA_RATE;
        double HRA = salary * HRA_RATE;

        double gross_salary = salary + DA + HRA;

        System.out.println("DA = " + DA);
        System.out.println("HRA = " + HRA);
        System.out.println("Gross Salary = " + gross_salary);

    }
}
