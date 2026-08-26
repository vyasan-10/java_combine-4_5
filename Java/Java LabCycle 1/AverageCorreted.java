import java.util.Scanner;

public class AverageCorreted {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Number 1: ");
        int num1 = sc.nextInt();

        System.out.println("Number 2: ");
        int num2 = sc.nextInt();

        System.out.println("Number 3: ");
        int num3 = sc.nextInt();

        double average = (num1 + num2 + num3) / 3.0;
        System.out.println("Average: " + average);
    }
}
