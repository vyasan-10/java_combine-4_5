import java.util.Scanner;

public class SimpleInterest {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("Principal: ");
        double P = sc.nextDouble();

        System.out.println("Rate: ");
        double R = sc.nextDouble();

        System.out.println("Time: ");
        double T = sc.nextDouble();

        double SI = (P * R * T) / 100;
        double amount = P + SI;

        System.out.println("Simple Interest: " + SI);
        System.out.println("Total Amount: " + amount);

        
    }
}
