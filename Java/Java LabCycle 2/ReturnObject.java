class Student {
    String name;
    int mark;

    Student(String n, int m) {
        name = n; mark = m;
    }
}

public class ReturnObject {
    static Student getStudent() {
        return new Student("Arun", 87);
    }

    public static void main(String[] args) {
        Student s = getStudent();
        System.out.println("Student Name : " + s.name + " Mark : " + s.mark);
    }
}
