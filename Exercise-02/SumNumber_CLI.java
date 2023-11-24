/* Question-01 Write a program to get 2 number from the user and print the sum
of two number using CLI - Command Line Interface*/
public class SumNumber_CLI {
    public static void main(String[] args) {
        int num1 = Integer.parseInt(args[0]);
        int num2 = Integer.parseInt(args[1]);
        System.out.println("The Sum of " + num1 + " + " + num2 + " Is : " + (num1 + num2));
    }
}