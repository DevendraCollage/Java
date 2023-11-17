
// todo: WAP to print odd numbers between 1 to n (While Loop)
import java.util.Scanner;

public class Odd_Number_While {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int i = 1;
        System.out.print("Enter The Range of Number You Want Odd Numbers : ");
        int num = sc.nextInt();
        while (i <= num) {
            if (i % 2 == 1) {
                System.out.println(i);
            }
            i++;
        }
        sc.close();
    }
}
