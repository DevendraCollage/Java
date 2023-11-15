
/*
 * Write an interactive program to print a diamond shape. For example, if user enters the number 3, the diamond will be as follows:   
 *   *
    * *
   * * *
    * *
     *
 */
import java.util.Scanner;

public class Array_Diamond {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter The Number You Want Pyramid : ");
        int num = sc.nextInt();
        // todo: Print Upper Part of the pyramid
        for (int i = 0; i < num; i++) {
            for (int j = num; j > i; j--) {
                System.out.print(" ");
            }
            for (int j = 0; j <= i; j++) {
                char ch = '*';
                System.out.print(ch + " ");
            }
            System.out.println();
        }
        // todo: Print bottom part of the pyramid
        for (int j = 1; j < num; j++) {
            for (int i = j; i > num; i--) {
                System.out.print(" ");
            }
            for (int i = j; i < num; i++) {
                char ch = '*';
                System.out.print("" + ch + " ");
            }
            System.out.println();
        }
        sc.close();
    }
}
