import java.util.Scanner;

public class MultiplicationTableAnalyzer {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();

        int sum = 0;
        int largest = 0;

        System.out.print("Multiplication Table: " + N + " ");

        for (int i = 1; i <= 10; i++) {
            int multiple = N * i;
            System.out.print(multiple + " ");
            sum += multiple;
            largest = multiple;
        }

        System.out.println("\nSum of multiples: " + sum);
        System.out.println("Largest multiple: " + largest);
    }
}