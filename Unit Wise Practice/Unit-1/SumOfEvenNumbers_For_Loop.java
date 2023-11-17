
// todo: Write a program that calculates and prints the sum of the even integers from 1 to 10.
import java.util.Scanner;

public class SumOfEvenNumbers_For_Loop {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter The Number You Want Sum of Even Number : ");
        int num = sc.nextInt();
        int sum = 0;
        for (int i = 1; i <= num; i++) {
            if (i % 2 == 0) {
                sum += i;
            }
        }
        System.out.println(sum);
        sc.close();
    }
}
