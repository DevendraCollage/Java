
// WAP using class Cube and calculate area using method with parameter
import java.util.Scanner;

class Cube {
    double height;
    double width;
    double depth;

    public double Area(double height, double width, double depth) {
        return height * width * depth;
    }
}

public class AreaOfCube {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Cube c = new Cube();
        System.out.print("Enter The Height Here : ");
        c.height = sc.nextDouble();
        System.out.print("Enter The Width Here : ");
        c.width = sc.nextDouble();
        System.out.print("Enter The Depth Here : ");
        c.depth = sc.nextDouble();
        System.out.println("The Area of Cube Is : " + c.Area(c.height, c.width, c.depth));
        sc.close();
    }
}
