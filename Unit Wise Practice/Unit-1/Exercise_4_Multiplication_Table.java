
// todo: WAP to print multiplication table using while loop. (While Loop)
import java.util.Scanner;

public class Exercise_4_Multiplication_Table {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter The Number You Want Multiplication Table : ");
        int num = sc.nextInt();
        int i = 1;
        while (i <= 10) {
            System.out.printf("%d x %d = %d\n", num, i, (num * i));
            i++;
        }
        sc.close();
    }
}