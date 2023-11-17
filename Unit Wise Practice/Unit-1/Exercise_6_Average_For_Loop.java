
// todo: Write a program to print average of n numbers. (Using For Loop)
import java.util.Scanner;

public class Exercise_6_Average_For_Loop {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter The Number You Want Average of that number : ");
        int num = sc.nextInt();
        int sum = 0;
        int avg;
        for (int i = 1; i <= num; i++) {
            sum += i;
        }
        avg = sum / num;
        System.out.println(avg);
        sc.close();
    }
}