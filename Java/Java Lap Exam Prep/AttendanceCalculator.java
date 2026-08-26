import java.util.Scanner;

public class AttendanceCalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Total Classes:");
        int totalClasses = sc.nextInt();

        System.out.print("Enter Total Attended Class:");
        int attendedClass = sc.nextInt();

        if (totalClasses <= 0 || attendedClass < 0 || attendedClass > totalClasses) {
            System.out.println("Invalid input....");
        } else {
            double percentage = ((double) attendedClass / totalClasses) * 100;
            System.out.println("Attended Percentage:" + percentage);
        }
    }
}