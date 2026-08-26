import java.util.Scanner;

public class Task3 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");

        System.out.println(sc.hasNextInt());
        System.out.println(sc.hasNextInt());
        System.out.println(sc.hasNextInt());

        int value = sc.nextInt();

        System.out.println("Value read: " + value);

        System.out.println(sc.hasNextInt());

        sc.close();
    }
}