
// todo: Taking user input through Scanner class.
import java.util.Scanner;

public class InputThroughScanner {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Your Name Here : ");
        String name = sc.nextLine();
        System.out.println("Your Name Is : " + name);
        sc.close();
    }
}
