import java.util.Scanner;

public class NumberStatistics {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number: ");

        int N = sc.nextInt();

        int oddSum = 0;
        int evenCount = 0;
        int largest = 0;

        System.out.println("Numbers: ");

        for (int i = 1; i <= N; i++) {
            System.out.print(i + "");

            if (i % 2 != 0) 
                oddSum += i;
            if (i % 2 == 0) 
                evenCount++;
            if (i%3 == 0)
                largest = i;
        }

        System.out.println("\nSum of odd numbers: " + oddSum);
        System.out.println("Count of even numbers: " + evenCount);
        System.out.println("Largest multiple of 3: " + largest);
    }
}
