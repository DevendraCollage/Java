
// todo: Write a program to get 2 numbers from the user and print the sum of two numbers using command line and Scanner class.
import java.util.Scanner;

public class Pro1_2 {
    public static void main(String[] args) {
        // Sum of two number using Scanner Class
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the first number : ");
        int num1 = sc.nextInt();
        System.out.print("Enter the second number : ");
        int num2 = sc.nextInt();
        int sum = num1 + num2;
        System.out.println("The sum is : " + sum);
        sc.close();
    }
}
