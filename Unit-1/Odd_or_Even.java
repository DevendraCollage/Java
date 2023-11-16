
// todo: WAP to print if a number is odd or even
import java.util.Scanner;

public class Odd_or_Even {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter The Number Here : ");
        int num = sc.nextInt();
        if (num % 2 == 0) {
            System.out.println(num + " Is Even Number!");
        } else {
            System.out.println(num + " Is Odd Number!");
        }
        sc.close();
    }
}
