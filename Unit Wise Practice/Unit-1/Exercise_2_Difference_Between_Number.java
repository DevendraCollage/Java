
// todo: Write a program which reads two numbers and based on different between
// it prints either of following message Difference is Positive or Difference is Negative.
import java.util.Scanner;

public class Exercise_2_Difference_Between_Number {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter The Number 1 Here : ");
        int num1 = sc.nextInt();
        System.out.print("Enter The Number 2 Here : ");
        int num2 = sc.nextInt();
        int difference = num1 - num2;
        if (difference < 0) {
            System.out.println("Difference is Negative!");
        } else {
            System.out.println("Difference if Positive!");
        }
        sc.close();
    }
}
