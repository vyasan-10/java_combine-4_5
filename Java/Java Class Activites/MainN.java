import java.util.Scanner;

public class MainN {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter number:");
        int n = sc.nextInt();

        int sum = 0;
        int count = 0;
        int largest = 0;

        for (int i = 1; i <=n; i++) {
            System.out.print(i + " ");

            sum += i;

            if(i%3==0) 
                count++;
            if(i%2!=0) 
                largest = i;
        }
        System.out.println("\nSum: " + sum);
        System.out.println("Count of multiples of 3: " + count);
        System.out.println("Largest odd number: " + largest);
    }
}
