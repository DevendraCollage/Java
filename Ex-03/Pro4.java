
// todo: Write a program to check that the given number is prime or not.
import java.util.Scanner;

public class Pro4 {
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
            System.out.printf("%d Is Prime Number!", num);
        } else {
            System.out.printf("%d Is Not Prime Number!", num);
        }
        sc.close();
    }
}
