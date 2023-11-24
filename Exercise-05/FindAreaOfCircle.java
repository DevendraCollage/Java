
// todo: Write a program to create circle class with area function to find area of circle.
import java.util.Scanner;
import java.lang.Math;

class Circle {
    public float area(float r) {
        return (float) (Math.PI * r * r);
    }
}

public class FindAreaOfCircle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter The Radius Of Circle : ");
        float radius = sc.nextFloat();
        Circle c = new Circle();
        System.out.println("The Area of Circle Is : " + c.area(radius));
        sc.close();
    }
}
