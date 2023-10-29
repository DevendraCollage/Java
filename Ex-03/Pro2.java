
// todo: Write a program to find that given number or string is palindrome or not.
import java.util.Scanner;

public class Pro2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean flag = true;
        System.out.print("Enter the String Here : ");
        String str = sc.nextLine();
        for (int i = 0; i < str.length() / 2; i++) {
            if (str.charAt(i) != str.charAt(str.length() - i - 1)) {
                flag = false;
                break;
            }
        }
        if (flag) {
            System.out.println(str);
            System.out.println("The String is Palindrome!");
        } else {
            System.out.println(str);
            System.out.println("The String is not Palindrome!");
        }
        sc.close();
    }
}