
// todo: Any year is entered through the keyboard, write a program to determine
// whether the year leap or not.
import java.util.Scanner;

public class Exercise_3_LeapYear {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter The Year Here : ");
        int year = sc.nextInt();
        if (year % 4 == 0) {
            System.out.println(year + " Is Leap Year!");
        } else {
            System.out.println(year + " Is Not Leap Year!");
        }
        sc.close();
    }
}
