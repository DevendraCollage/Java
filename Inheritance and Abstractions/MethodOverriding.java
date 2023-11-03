// todo: Simple Method OverRiding 
class Shape {
    void draw() {
        System.out.println("Draw Shape");
    }
}

class Circle extends Shape {
    void draw() {
        System.out.println("Draw Circle");
    }
}

class Square extends Shape {
    void draw() {
        System.out.println("Draw Square");
    }
}

public class MethodOverriding {
    public static void main(String[] args) {
        Shape s = new Shape();
        s.draw();
        Circle c = new Circle();
        c.draw();
        Square s1 = new Square();
        s1.draw();
    }
}
