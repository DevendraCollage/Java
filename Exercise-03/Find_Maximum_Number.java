
// todo: Write a program to find maximum no from given 3 no.
import java.util.Scanner;

public class Find_Maximum_Number {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number 1 here : ");
        int num1 = sc.nextInt();
        System.out.print("Enter the number 2 here : ");
        int num2 = sc.nextInt();
        System.out.print("Enter the number 3 here : ");
        int num3 = sc.nextInt();
        if (num1 > num2 && num1 > num3) {
            System.out.println(num1 + " Is Greater Among Them!");
        } else if (num2 > num3) {
            System.out.println(num2 + " Is Greater Among Them!");
        } else {
            System.out.println(num3 + " Is Greater Among Them!");
        }
        sc.close();
    }
}
