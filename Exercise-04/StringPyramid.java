
/*
 * Write an interactive program to print a string entered in a pyramid form. For instance, the string "stream" has to be displayed as follows:
 *      s
 *     s t
 *    s t r
 *   s t r e
 *  s t r e a
 * s t r e a m
 */
import java.util.Scanner;

public class StringPyramid {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter The String Here to Print In Pyramid Style : ");
        String str = sc.nextLine();
        for (int i = 0; i < str.length(); i++) {
            for (int j = str.length(); j > i; j--) {
                System.out.print(" ");
            }
            for (int j = 0; j <= i; j++) {
                char ch = str.charAt(j);
                System.out.print("" + ch + " ");
            }
            System.out.println();
        }
        sc.close();
    }
}
