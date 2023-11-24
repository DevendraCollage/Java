
// todo: Write a program to calculate the area of circle.
import java.util.Scanner;
import java.lang.Math; // Using Math to Use the PI Value.

public class AreaofCircle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter The Radius of Circle : ");
        float radius = sc.nextFloat();
        float area = (float) (Math.PI * radius * radius);
        System.out.println("The Area of Circle Is : " + area);
        sc.close();
    }
}
