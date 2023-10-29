
// todo: Write a program to find maximum no from given 3 no.
import java.util.Scanner;

public class Pro3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter The Number 1 Here : ");
        int num1 = sc.nextInt();
        System.out.print("Enter The Number 2 Here : ");
        int num2 = sc.nextInt();
        System.out.print("Enter The Number 3 Here : ");
        int num3 = sc.nextInt();
        if (num1 > num2 && num1 > num3) {
            System.out.printf("%d Is Greater Among Them!", num1);
        } else if (num2 > num3) {
            System.out.printf("%d Is Greater Among Them!", num2);
        } else {
            System.out.printf("%d Is Grater Among Them!", num3);
        }
        sc.close();
    }
}
