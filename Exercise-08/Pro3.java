
/*
 * WAP to create Account class, which is representing a bank account where we can deposit 
 * and withdraw money. if we want to withdraw money which exceed our bank balance? We will 
 * not be allowed, create InSufficientFundException to handle above situation and display 
 * proper error message.
 */
import java.util.Scanner;

class Account {
    double amount;

    Account() {
        amount = 5000;
    }

    void display() { // First Choice
        System.out.println("Current Balance = " + amount);
    }

    void deposit(double d) { // Second Choice
        amount += d;
    }

    void withdraw(double d) { // Third Choice
        try {
            if ((amount - d) < 5000) {
                throw new Exception("Not Enough Balance! Balance Must be Greater Than 5000");
            } else {
                amount = amount - d;
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}

public class Pro3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Account a = new Account();
        while (true) {
            System.out.print("\nEnter Choice from Below\n1.Balance\n2.Deposit\n3.Withdrawn\n4.Exit\n");
            int choice = sc.nextInt();
            switch (choice) {
                case 1:
                    a.display();
                    break;
                case 2:
                    System.out.print("Enter The Amount You Deposit : ");
                    double amt = sc.nextDouble();
                    a.deposit(amt);
                    a.display();
                    break;
                case 3:
                    System.out.print("Enter The Amount Withdrawn : ");
                    double with = sc.nextDouble();
                    a.withdraw(with);
                    a.display();
                    break;
                case 4: // Fourth Choice Exit From The System
                    System.exit(0);
                    break;   
                default:
                    System.out.println("Enter Valid Choice!");
                    break;
            }
        }
    }
}