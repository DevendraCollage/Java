
// todo: Create a class named Bank_Account with data members accountNo, userName, email, accountType and accountBalance, Also create methods getAccountDetails() and displayAccountDetails().
import java.util.Scanner;

class Bank_Account {
    // todo: Class Property
    int accountNo;
    String userName;
    String email;
    String accountType;
    int accountBalance = 1000; // Already Define The Minimum Bank Balance

    public void getAccountDetails() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Account No : ");
        accountNo = sc.nextInt();
        sc.nextLine();
        System.out.print("Enter User Name Here : ");
        userName = sc.nextLine();
        System.out.print("Enter Email Here : ");
        email = sc.nextLine();
        System.out.print("Enter Account Type Here : ");
        accountType = sc.nextLine();
        sc.close();
    }

    public void displayAccountDetails() {
        System.out.println("-- Your Account Details Here --");
        System.out.println("Your Account No Is : " + accountNo);
        System.out.println("Your Name Is : " + userName);
        System.out.println("Your Email Is : " + email);
        System.out.println("Your Account Type Is : " + accountType);
        System.out.println("Your Account Balance Is : " + accountBalance);
    }
}

public class BankAccount_Details {
    public static void main(String[] args) {
        // Scanner sc = new Scanner(System.in);
        Bank_Account bn = new Bank_Account();
        System.out.println("Enter Bank Account Details!");
        bn.getAccountDetails(); // Calling getAccountDetails() Method
        bn.displayAccountDetails(); // Calling displayAccountDetails() Method

        // // After that get the user choice from the user
        // System.out.println("1. Create Account");
        // System.out.println("2. Deposit");
        // System.out.println("3. Withdraw");
        // System.out.println("4. Balance");
        // System.out.println("5. Account Details");
        // System.out.println("6. Exit");
        // System.out.print("Enter The Choice From The Above : ");
        // int choice = sc.nextInt();
        // switch (choice) {
        // case 1:
        // bn.getAccountDetails();
        // break;
        // case 2:

        // default:
        // break;
        // }
    }
}
