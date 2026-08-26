import java.util.Scanner;

class Student {
    private int rollNo;
    private String name;
    private int marks;

    public void setStudent() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Roll No: ");
        rollNo = sc.nextInt();
        sc.nextLine(); // consume newline
        System.out.print("Enter Name: ");
        name = sc.nextLine();
        System.out.print("Enter Marks: ");
        marks = sc.nextInt();
    }

    public int getRollNo() { return rollNo; }
    public String getName() { return name; }
    public int getMarks() { return marks; }
}

class StudentUtility {
    public static void displayStudent(Student s) {
        System.out.println("Roll No: " + s.getRollNo());
        System.out.println("Name: " + s.getName());
        System.out.println("Marks: " + s.getMarks());
        System.out.println("-------------------");
    }
}

public class StudentMain {
    public static void main(String[] args) {
        Student s1 = new Student();
        Student s2 = new Student();

        s1.setStudent();
        s2.setStudent();

        StudentUtility.displayStudent(s1);
        StudentUtility.displayStudent(s2);
    }
}
