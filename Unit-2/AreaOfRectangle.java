
// WAP using class Rectangle and Calculate area using method
import java.util.Scanner;

class Rectangle {
    double width;
    double length;

    public double Area() {
        return width * length;
    }
}

public class AreaOfRectangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Rectangle r = new Rectangle();
        System.out.print("Enter The Width Here : ");    
        r.width = sc.nextDouble();
        System.out.print("Enter The Length Here : ");
        r.length = sc.nextDouble();
        System.out.println("The Area of Rectangle Is : " + r.Area());
        sc.close();
    }
}
