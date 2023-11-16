
/*  Write a menu driven program that allows the users to enter five number and then choose
between finding the smallest, largest, sum or average. Use Switch case to determine what
action to take. Provide error message if an invalid choice is entered
*/
import java.util.Scanner;

public class Menu_Driven {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Number 1 Here : ");
        int num1 = sc.nextInt();
        System.out.print("Enter Number 2 Here : ");
        int num2 = sc.nextInt();
        System.out.print("Enter Number 3 Here : ");
        int num3 = sc.nextInt();
        System.out.print("Enter Number 4 Here : ");
        int num4 = sc.nextInt();
        System.out.print("Enter Number 5 Here : ");
        int num5 = sc.nextInt();
        System.out.println("1. Finding The Smallest Number Among Them!");
        System.out.println("2. Finding The Largest Number Among Them!");
        System.out.println("3. Sum of all numbers!");
        System.out.println("4. Find Average of numbers!");
        System.out.print("Enter The Choice From Above : ");
        int choice = sc.nextInt();
        int sum = 0;
        switch (choice) {
            // Smallest Number Among Them
            case 1:
                if (num1 < num2 && num1 < num3 && num1 < num4 && num1 < num5) {
                    System.out.println(num1 + " Is Smallest Among Them!");
                } else if (num2 < num3 && num2 < num4 && num2 < num5) {
                    System.out.println(num2 + " Is Smallest Among Them!");
                } else if (num3 < num4 && num3 < num5) {
                    System.out.println(num3 + " Is Smallest Among Them!");
                } else if (num4 < num5) {
                    System.out.println(num4 + " Is Smallest Among Them!");
                } else {
                    System.out.println(num5 + " Is Smallest Among Them!");
                }
                break;
            // Greatest Number Among Them
            case 2:
                if (num1 > num2 && num1 > num2 && num1 > num3 && num1 > num4 && num1 > num5) {
                    System.out.println(num1 + " Is Greatest Among Them!");
                } else if (num2 > num3 && num2 > num4 && num2 > num5) {
                    System.out.println(num2 + " Is Greatest Among Them!");
                } else if (num3 > num4 && num3 > num5) {
                    System.out.println(num3 + " Is Greatest Among Them!");
                } else if (num4 > num5) {
                    System.out.println(num4 + " Is Greatest Among Them!");
                } else {
                    System.out.println(num5 + " Is Greatest Among Them!");
                }
                break;
            // Sum of all Numbers
            case 3:
                sum = num1 + num2 + num3 + num4 + num5;
                System.out.println("The Sum of All Number Is : " + sum);
                break;
            // Average of Numbers
            case 4:
                int average;
                average = (num1 + num2 + num3 + num4 + num5) / 5;
                System.out.println("Average of All Numbers Is : " + average);
                break;
            default:
                System.out.println("Invalid Choice! Enter The Valid Choice!");
                break;
        }
        sc.close();
    }
}
