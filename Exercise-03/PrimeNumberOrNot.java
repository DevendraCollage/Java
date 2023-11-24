
// todo: Write a program to check that the given number is prime or not.
import java.util.Scanner;

public class PrimeNumberOrNot {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter The Number Here : ");
        int num = sc.nextInt();
        boolean flag = true;
        for (int i = 2; i < num - 1; i++) {
            if (num % i == 0) {
                flag = false;
                break;
            }
        }
        if (flag) {
            System.out.println("The " + num + " Is Prime Number!");
        } else {
            System.out.println("The " + num + " Is Not Prime Number!");
        }
        sc.close();
    }
}
