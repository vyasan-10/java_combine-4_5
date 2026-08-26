import java.util.Scanner;

public class Task2 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int age;

        while (true) {

            System.out.print("Enter your age: ");

            if (sc.hasNextInt()) {

                age = sc.nextInt();

                if (age >= 1 && age <= 120) {
                    break;
                } else {
                    System.out.println(
                        "Age out of range! Please enter a value between 1 and 120."
                    );
                }

            } else {

                System.out.println(
                    "Invalid input! Please enter an integer."
                );

                sc.next();
            }
        }

        System.out.println("Your age is: " + age);

        sc.close();
    }
}