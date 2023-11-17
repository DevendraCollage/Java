
// todo: WAP to print if a number is zero or positive or negative
import java.util.Scanner;

public class Number_Positive_Negative_Zero {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter The Number Here : ");
        int num = sc.nextInt();
        if (num > 0) {
            System.out.println(num + " Is Positive Number!");
        } else if (num == 0) {
            System.out.println(num + " Is Equal To Zero!");
        } else {
            System.out.println(num + " Is Negative Number!");
        }
        sc.close();
    }
}
