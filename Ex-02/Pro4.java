
// todo: Write a program to calculate the area of circle.
import java.util.Scanner;
import java.lang.Math;

public class Pro4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter The Radius of Circle : ");
        float r = sc.nextFloat();
        float area = (float) (Math.PI * r * r);
        System.out.print("The Area Of Circle Is : " + area);
        sc.close();
    }
}
