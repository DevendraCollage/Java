
// todo: Taking user input through Scanner class.
import java.util.Scanner;

public class Pro3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter The Number Here : ");
        int num = sc.nextInt();
        System.out.println("You Have Entered Number Is : " + num);
        sc.close();
    }
}
