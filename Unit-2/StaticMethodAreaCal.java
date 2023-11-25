
// WAP using class Rectangle and calculate area
import java.util.Scanner;

class Rectangle {
    static int height;
    static int width;

    static void calculate() { // Static Method Only Called by static method
        System.out.println("Area : " + (height * width));
    }
}

public class StaticMethodAreaCal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Rectangle r = new Rectangle();
        System.out.print("Enter The Height Here : ");
        r.height = sc.nextInt();
        System.out.print("Enter The Width Here : ");
        r.width = sc.nextInt();
        r.calculate();
        sc.close();
    }
}