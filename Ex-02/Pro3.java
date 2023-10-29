
// todo: Write a program to create basic calculator by getting 2 numbers and 1 string (operation) from the user and apply the operation given in a string on the given numbers.
import java.util.Scanner;

public class Pro3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter The Number 1 Here : ");
        int num1 = sc.nextInt();
        System.out.print("Enter The Number 2 Here : ");
        int num2 = sc.nextInt();
        sc.nextLine();
        System.out.print("Enter The Operation you want to perform(+,-,/,*) : ");
        String operation = sc.nextLine();
        switch (operation) {
            case "+":
                System.out.printf("%d + %d = %d\n", num1, num2, num1 + num2);
                break;
            case "-":
                System.out.printf("%d - %d = %d\n", num1, num2, num1 - num2);
                break;
            case "/":
                System.out.printf("%d / %d = %d\n", num1, num2, num1 / num2);
                break;
            case "*":
                System.out.printf("%d * %d = %d\n", num1, num2, num1 * num2);
                break;
            default:
                System.out.println("Enter The Valid Operation!");
                sc.close();
        }
    }
}
