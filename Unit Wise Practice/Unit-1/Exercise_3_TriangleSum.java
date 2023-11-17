
/*
 * Write a program to check whether a triangle is valid or not, when the three
 * angles of the triangle are entered through the keyboard. A triangle is valid
 * if the sum of all the angles is equal to 180 degree.
 */
import java.util.Scanner;

public class Exercise_3_TriangleSum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter The Degree of Angle 1 : ");
        float angle1 = sc.nextFloat();
        System.out.print("Enter The Degree of Angle 2 : ");
        float angle2 = sc.nextFloat();
        System.out.print("Enter The Degree of Angle 3 : ");
        float angle3 = sc.nextFloat();
        float sumAngle = angle1 + angle2 + angle3;
        System.out.println("All The Angle of Triangle Sum Is : " + sumAngle);
        if (sumAngle == 180) {
            System.out.println("This is an Valid Triangle!");
        } else {
            System.out.println("This is not Valid Triangle!");
        }
        sc.close();
    }
}
