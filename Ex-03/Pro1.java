
// todo: The marks obtained by a student in 5 different subjects are input through the keyboard.
import java.util.Scanner;

public class Pro1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter The Sub-1 Here : ");
        float sub1 = sc.nextFloat();
        System.out.print("Enter The Sub-2 Here : ");
        float sub2 = sc.nextFloat();
        System.out.print("Enter The Sub-3 Here : ");
        float sub3 = sc.nextFloat();
        System.out.print("Enter The Sub-4 Here : ");
        float sub4 = sc.nextFloat();
        System.out.print("Enter The Sub-5 Here : ");
        float sub5 = sc.nextFloat();
        float total = sub1 + sub2 + sub3 + sub4 + sub5;
        System.out.println("Your Total Is : " + total);
        float per = total / 5;
        System.out.println("Your Percentage Is : " + per);
        if (per >= 60) {
            System.out.println("First Division!");
        } else if (per >= 50 && per <= 59) {
            System.out.println("Second Division!");
        } else if (per >= 40 && per <= 49) {
            System.out.println("Third Division!");
        } else {
            System.out.println("Fail!");
        }
        sc.close();
    }
}
