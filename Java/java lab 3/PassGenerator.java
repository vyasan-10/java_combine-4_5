import java.util.Scanner;

public class PassGenerator {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Numeric Password: ");
        String password = sc.nextLine();

        boolean odd = false;
        boolean even = false;
        boolean valid = true;
        int sum = 0;

        // Check minimum length
        if (password.length() < 6) {
            valid = false;
        }

        for (int i = 0; i < password.length(); i++) {

            char ch = password.charAt(i);

            // Check if character is a digit
            if (!Character.isDigit(ch)) {
                valid = false;
                break;
            }

            int digit = ch - '0';

            sum += digit;

            if (digit % 2 == 0)
                even = true;
            else
                odd = true;
        }

        if (sum > 20)
            valid = false;

        if (valid && odd && even) {
            System.out.println("Valid Password");
        } else {
            System.out.println("Invalid Password");
        }

        sc.close();
    }
}