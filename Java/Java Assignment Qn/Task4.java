import java.util.Scanner;

public class Task4 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String name;
        int age;
        double marks;

        System.out.print("Enter name: ");
        name = sc.nextLine();

        while (true) {

            System.out.print("Enter age: ");

            if (sc.hasNextInt()) {

                age = sc.nextInt();
                break;

            } else {

                System.out.println(
                    "Invalid age! Please enter an integer."
                );

                sc.next();
            }
        }

        while (true) {

            System.out.print("Enter marks: ");

            if (sc.hasNextDouble()) {

                marks = sc.nextDouble();
                break;

            } else {

                System.out.println(
                    "Invalid marks! Please enter a number."
                );

                sc.next();
            }
        }

        System.out.println(
            "Name: " + name +
            ", Age: " + age +
            ", Marks: " + marks
        );

        sc.close();
    }
}