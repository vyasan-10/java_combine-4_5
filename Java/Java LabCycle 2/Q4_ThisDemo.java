class Student {
    String name;
    int age;

    Student(String name, int age) {
        this.name = name;
        this.age = age;
    }
    void display() {
        System.out.println("Name:" + name + " Age:" + age);
    }
}

public class Q4_ThisDemo {
    public static void main(String[] args) {
        Student s1 = new Student("Santhosh Kannan", 23);
        s1.display();
    }
}
