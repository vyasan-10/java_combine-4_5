// Abstract class
abstract class StudentEvaluation {
    String name;
    int rollNo;

    public StudentEvaluation(String name, int rollNo) {
        this.name = name;
        this.rollNo = rollNo;
    }

    public void displayDetails() {
        System.out.println("Name: " + name + ", Roll No: " + rollNo);
    }

    public abstract int calculateTotalMarks();
    public abstract char displayGrade();
}

class UGCourseEvaluation extends StudentEvaluation {
    int[] marks;

    public UGCourseEvaluation(String name, int rollNo, int[] marks) {
        super(name, rollNo);
        this.marks = marks;
    }

    public int calculateTotalMarks() {
        int sum = 0;
        for (int m : marks) sum += m;
        return sum;
    }

    public char displayGrade() {
        int total = calculateTotalMarks();
        return (total >= 240) ? 'A' : (total >= 180) ? 'B' : 'C';
    }
}

class PGCourseEvaluation extends StudentEvaluation {
    int project, exam;

    public PGCourseEvaluation(String name, int rollNo, int project, int exam) {
        super(name, rollNo);
        this.project = project;
        this.exam = exam;
    }

    public int calculateTotalMarks() {
        return project + exam;
    }

    public char displayGrade() {
        int total = calculateTotalMarks();
        return (total >= 160) ? 'A' : (total >= 120) ? 'B' : 'C';
    }
}

class CertificateCourseEvaluation extends StudentEvaluation {
    int assignment, test;

    public CertificateCourseEvaluation(String name, int rollNo, int assignment, int test) {
        super(name, rollNo);
        this.assignment = assignment;
        this.test = test;
    }

    public int calculateTotalMarks() {
        return assignment + test;
    }

    public char displayGrade() {
        int total = calculateTotalMarks();
        return (total >= 80) ? 'A' : (total >= 60) ? 'B' : 'C';
    }
}

public class UniversityEvaluation {
    public static void main(String[] args) {
        StudentEvaluation[] students = {
            new UGCourseEvaluation("Arun", 101, new int[]{80, 75, 85}),
            new UGCourseEvaluation("Meena", 102, new int[]{90, 88, 92}),
            new PGCourseEvaluation("Ravi", 201, 70, 85),
            new CertificateCourseEvaluation("Kiran", 301, 40, 35),
            new CertificateCourseEvaluation("Divya", 302, 50, 45)
        };

        for (StudentEvaluation s : students) {
            s.displayDetails();
            System.out.println("Total Marks: " + s.calculateTotalMarks());
            System.out.println("Grade: " + s.displayGrade());
            System.out.println("---------------------------");
        }
    }
}
