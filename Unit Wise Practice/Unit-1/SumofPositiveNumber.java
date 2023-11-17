
// todo: WAP to calculate the sum of positive number.
import java.util.Scanner;

public class SumofPositiveNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int sum = 0;
        int n;
        System.out.print("How Many Time Iterate The Loop : ");
        int num = sc.nextInt();
        for (int i = 1; i <= num; i++) {
            n = sc.nextInt();
            if (n < 0) {
                // continue; // This for Continue Demo Program
                break; // This for Break Demo Program
            }
            sum += n;
        }
        System.out.println("sum = " + sum);
        sc.close();
    }
}
