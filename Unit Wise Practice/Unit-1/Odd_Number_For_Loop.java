
// todo: WAP to print odd numbers between 1 to n
import java.util.Scanner;

public class Odd_Number_For_Loop {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter The Number You Want odd Number : ");
        int num = sc.nextInt();
        for (int i = 1; i <= num; i++) {
            if (i % 2 != 0) {
                System.out.println(i);
            }
        }
        sc.close();
    }
}
