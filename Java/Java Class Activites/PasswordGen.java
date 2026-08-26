import java.util.Scanner;

public class PasswordGen {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Password: ");
        String password = sc.nextLine();

        boolean hasOdd = false;
        boolean hasEven = false;
        int sum = 0;

        for (int i = 0; i < password.length(); i++) {

            char ch = password.charAt(i);

            // Check only if the character is a digit
            if (Character.isDigit(ch)) {

                int digit = ch - '0'; // Convert character to integer

                sum += digit;

                if (digit % 2 == 0)
                    hasEven = true;
                else
                    hasOdd = true;
            }
        }

        if (password.length() >= 6 && hasOdd && hasEven && sum <= 20) {
            System.out.println("Password is Valid");
        } else {
            System.out.println("Password is Invalid");
        }

        System.out.println("Total Digit Sum = " + sum);
    }
}