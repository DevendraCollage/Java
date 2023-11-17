
// todo: WAP to print the number is positive or not.
import java.util.Scanner;

public class Number_PositiveOrNot {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter The Number Here : ");
        int num = sc.nextInt();
        if (num > 0) {
            System.out.println(num + " Is Positive Number!");
        } else {
            System.out.println(num + " Is Not Positive Number!");
        }
        sc.close();
    }
}
