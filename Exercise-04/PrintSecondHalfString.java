
// todo: Write a program to find length of string and print second half of the string.
import java.util.Scanner;

public class PrintSecondHalfString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter The String Here : ");
        String str = sc.nextLine();
        int len = str.length(); // todo: This will Store The Length of the String
        for (int i = len / 2; i < len; i++) {
            System.out.print((char) (str.charAt(i)));
        }
        sc.close();
    }
}
