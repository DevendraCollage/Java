
// todo: WAP to print day name from day number
import java.util.Scanner;

public class DayName_If_ElseIf_Else {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter The Day Number : ");
        int dayNum = sc.nextInt();
        if (dayNum == 1) {
            System.out.println("Sunday");
        } else if (dayNum == 2) {
            System.out.println("Monday");
        } else if (dayNum == 3) {
            System.out.println("Tuesday");
        } else if (dayNum == 4) {
            System.out.println("Wednesday");
        } else if (dayNum == 5) {
            System.out.println("Thursday");
        } else if (dayNum == 6) {
            System.out.println("Friday");
        } else {
            System.out.println("Saturday");
        }
        sc.close();
    }
}
