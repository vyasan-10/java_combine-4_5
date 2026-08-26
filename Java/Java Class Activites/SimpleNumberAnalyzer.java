import java.util.Scanner;

public class SimpleNumberAnalyzer {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();

        int sumEven = 0;
        int countOdd = 0;

        System.out.print("Numbers: ");
        for (int i = 0; i < N; i++) {
            System.out.print(i  + " ");
            if (i % 2 == 0) {
                sumEven += i;
            } else {
                countOdd++;
            }
}
        System.out.println("\nSum of even numbers: " + sumEven);
        System.out.println("Count of odd numbers: " + countOdd);
    }
}
