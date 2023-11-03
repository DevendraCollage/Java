class Shape {
    protected String name;
    public String color;

    void shape() {
        System.out.println("Shape constructor");
    }
}

class Circle extends Shape {
    double radius = 5;
    double PI = 3.1416;

    double calCircleArea() {
        return radius * radius * PI;
    }
}

class Rectangle extends Shape {
    double height = 5;
    double width = 2;

    double calRectArea() {
        return height * width;
    }
}

class Triangle extends Shape {
    double length = 5;
    double width = 2;

    double calTriArea() {
        return length * width / 2;
    }
}

public class Exercise_2 {
    public static void main(String[] args) {
        Shape s = new Shape();
        s.shape();

        Circle c = new Circle();
        c.calCircleArea();

        Rectangle r = new Rectangle();
        r.calRectArea();

        Triangle t = new Triangle();
        t.calTriArea();
    }
}
