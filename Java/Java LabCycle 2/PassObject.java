class Student {
    String name;
    int roll;

    Student(String n, int r) {
        name = n;
        roll = r;
    }
}

public class PassObject {
    static void display(Student s) {
        System.out.println("Student Name : " + s.name + " Roll No : " + s.roll);
    }

    public static void main(String[] args) {
        Student s = new Student("Neha", 25);
        display(s);
    }
}
