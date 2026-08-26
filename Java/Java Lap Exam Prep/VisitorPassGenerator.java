import java.util.Scanner;

public class VisitorPassGenerator {
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);

        // Visitor Name
        System.out.println("Enter Visitor Name:");
        String visitorName = sc.nextLine();

        // Visit date
        System.out.println("Enter Visitor Date:");
        String visitDate = sc.nextLine();

        // Host Employee name
        System.out.println("Enter Host Employee Name:");
        String hostEmployeeName = sc.nextLine();

        // Pass Number
        System.out.println("Enter PassNumber:");
        int passNumber = sc.nextInt();

        System.out.println("\n=============== Visitor Pass Generator=================");
        System.out.println("Visitor Name\t: " + visitorName);
        System.out.println("Visit Date\t: " + visitDate);
        System.out.println("Host Employee Name\t: " + hostEmployeeName);
        System.out.println("Pass Number\t: " + passNumber);

    }
}