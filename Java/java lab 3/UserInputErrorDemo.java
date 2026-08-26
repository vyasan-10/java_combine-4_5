import java.util.InputMismatchException;
import java.util.Scanner;

public class UserInputErrorDemo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
    
        try {
            System.out.println("Enter Your Age: ");
            int age = sc.nextInt();

            System.out.println("Your age is :" + age);
        }
        catch (InputMismatchException e) {
            System.out.println("Invalid input! Please enter a valid integer for age.");
        } 
        finally {
            sc.close();
        }
        
    }
} 