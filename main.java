import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("**Welcome to the Banking System**\n");
        // Add your main logic here
        System.out.println("Please enter your account number:");
        String inputNo = sc.nextLine();

        SavingAccounts sa = new SavingAccounts();
        if (sa.checkAccount(inputNo)) {
            System.out.println("Account verified.");
            System.out.println("\nchoose Account type:");
            System.out.println("1. Saving Account");
            System.out.println("2. Current Account");
            int choice = sc.nextInt();

            if (choice == 1) {
                System.out.println("***Saving account activated***");
                System.out.println("your current balance is:");
                sa.displayBalance();

                System.out.println("Select an operation: 1. Deposit | 2. Withdraw");
                int op = sc.nextInt();
                if (op == 1) {
                    System.out.println("Enter amount to deposit:");
                    double amount = sc.nextDouble();
                    sa.deposit(amount);
                    System.out.println("Check updated balance: press 1");
                    int checkBalance = sc.nextInt();
                    if (checkBalance == 1) {
                        sa.displayBalance();
                    } else {
                        System.out.println("Invalid input. Returning to main menu.");
                    }

                } else if (op == 2) {
                    System.out.println("Enter amount to withdraw:");
                    double amount = sc.nextDouble();
                    sa.withdraw(amount);
                    System.out.println("Check updated balance: press 1");
                    int checkBalance = sc.nextInt();
                    if (checkBalance == 1) {
                        sa.displayBalance();
                    } else {
                        System.out.println("Invalid input. Returning to main menu.");
                    }

                }
            }
        }
        else{
            System.out.println("Invalid account number. Access denied.");
        }

        sc.close();
    }
}
