
/* Write a program to get 2 numbers from the user and print the sum of the
 * two numbers using Scanner class.
 */
import java.util.Scanner;

public class SumNumber_Scanner {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter The Number 1 Here : ");
        int num1 = sc.nextInt();
        System.out.print("Enter The Number 2 Here : ");
        int num2 = sc.nextInt();
        System.out.println("The Sum of " + num1 + " + " + num2 + " Is : " + (num1 + num2));
        sc.close();
    }
}
