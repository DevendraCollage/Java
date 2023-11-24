
// todo: Write a program to find that given number or string is palindrome or not.
import java.util.Scanner;

public class Palindrome_String {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean flag = true;
        System.out.print("Enter The String Here : ");
        String str = sc.nextLine();
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) != str.charAt(str.length() - i - 1)) { // This will check if the string in reverse
                                                                     // are same in the original string
                flag = false;
                break;
            }
        }
        if (flag) {
            System.out.println(str);
            System.out.println("The String Is Palindrome!");
        } else {
            System.out.println(str);
            System.out.println("The String Is Not Palindrome!");
        }
        sc.close();
    }
}
