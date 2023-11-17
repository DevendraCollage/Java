
// todo: Write a program that calculates and prints the sum of even integers from 1 to 10.
import java.util.Scanner;

public class Exercise_5_Sum_Even_Number {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter The Number You Want Sum of all Even Number : ");
        int num = sc.nextInt();
        int i = 1;
        int sum = 0;
        while (i <= num) {
            if (i % 2 == 0) {
                sum += i;
                System.out.println(i);
            }
            i++;
        }
        System.out.println("The Sum of Even number Is : " + sum);
        sc.close();
    }
}
