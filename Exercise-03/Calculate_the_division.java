
/*
 * The marks obtained by a student in 5 different subjects are input through the keyboard.
 * The student gets a division as per the following rules: 
 * I. Percentage above or equals to 60-first division 
 * II. Percentage between 50 to 59-second division 
 * III. Percentage between 40 and 49-Third division 
 * IV. Percentage less than 40-fail
 * Write a program to calculate the division obtained by the student.
 */
import java.util.Scanner;

public class Calculate_the_division {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Subject 1 Marks : ");
        float sub1 = sc.nextFloat();
        System.out.print("Enter Subject 2 Marks : ");
        float sub2 = sc.nextFloat();
        System.out.print("Enter Subject 3 Marks : ");
        float sub3 = sc.nextFloat();
        System.out.print("Enter Subject 4 Marks : ");
        float sub4 = sc.nextFloat();
        System.out.print("Enter Subject 5 Marks : ");
        float sub5 = sc.nextFloat();
        float total = sub1 + sub2 + sub3 + sub4 + sub5; // todo: This will calculate the total of all subjects
        System.out.println("Your Total Is : " + total);
        float percentage = total / 5; // todo: This will calculate the percentage of all the subjects
        System.out.println("Your Percentage Is : " + percentage);
        if (percentage >= 60) {
            System.out.println("You Get First Division!");
        } else if (percentage > 50 && percentage <= 59) {
            System.out.println("You Get Second Division!");
        } else if (percentage > 40 && percentage <= 49) {
            System.out.println("You Get Third Division!");
        } else {
            System.out.println("You Are Fail!");
        }
        sc.close();
    }
}