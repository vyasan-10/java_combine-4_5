import java.util.Scanner;

public class StudentInfo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Student Name: ");
        String name = sc.nextLine();

        System.out.println("Roll No: ");
        int rollno = sc.nextInt();

        sc.nextLine();
        System.out.println("Course: ");
        String course = sc.nextLine();

        System.out.println("Percentage: ");
        double percentage = sc.nextDouble();

        System.out.println("Student Details");
        System.out.println("-----------------");
        System.out.println("Name:" + name);
        System.out.println("Roll No: " + rollno);
        System.out.println("Course: " + course);
        System.out.println("Percentage: " + percentage);

    }
}
