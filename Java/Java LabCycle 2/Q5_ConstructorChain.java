class Student {
    String name;
    int age;

    Student() {
        System.out.print("Default Constructor");
    }
    Student(String name, int age) {
        this();
        this.name = name;
        this.age = age;

        System.out.println("Parameterized Constructor");
        System.out.println("Name:" + name + " Age:" + age);
    }
}

public class Q5_ConstructorChain {
    public static void main(String[] args) {
        Student s1 = new Student("Manu", 21);
    }
}
