// todo: Write a program to get 2 numbers from the user and print the sum of two numbers using command line and Scanner class.
public class Pro1 {
    public static void main(String[] args) {
        // Sum Using Command Line
        int num1 = Integer.parseInt(args[0]);
        int num2 = Integer.parseInt(args[1]);
        System.out.println("Sum of " + num1 + " and " + num2 + " is: " + (num1 + num2));
    }
}