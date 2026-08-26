import java.util.Scanner;

public class ExpressionEvaluate {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter A: ");
        int a = sc.nextInt();

        System.out.println("Enter B: ");
        int b = sc.nextInt();

        System.out.println("Enter C: ");
        int c = sc.nextInt();

        System.out.println("Enter D: ");
        int d = sc.nextInt();

        System.out.println("Enter E: ");
        int e = sc.nextInt();

        int result = a + b * c - d / e;

        System.out.println("Result = " + result);
    }
}
