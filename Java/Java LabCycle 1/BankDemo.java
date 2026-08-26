// Class 1
class BankAccount {
    private String accountHolder;
    private double balance;

    // Constructor
    public BankAccount(String accountHolder, double balance) {
        this.accountHolder = accountHolder;
        this.balance = balance;
    }

    public void deposit(double amount) {
        balance += amount;
        System.out.println("Deposited: " + amount);
    }

    public void withdraw(double amount) {
        if (amount <= balance) {
            balance -= amount;
            System.out.println("Withdrawn: " + amount);
        } else {
            System.out.println("Insufficient balance!");
        }
    }

    public void displayInfo() {
        System.out.println("Account Holder: " + accountHolder);
        System.out.println("Balance: " + balance);
    }
}

// Class 2
public class BankDemo {
    public static void main(String[] args) {
        // Create account object
        BankAccount acc1 = new BankAccount("Santhosh", 5000);

        acc1.displayInfo();
        acc1.deposit(1500);
        acc1.withdraw(2000);
        acc1.withdraw(6000);
        acc1.displayInfo();
    }
}
