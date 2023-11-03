// todo: Method OverRiding With Super Keyword
class Shape {
    void draw() {
        System.out.println("Draw Shape!");
    }
}

class Circle extends Shape {
    void draw() {
        super.draw();
        System.out.println("Draw Circle!");
    }
}

class Square extends Shape {
    void draw() {
        System.out.println("Draw Square!");
    }
}

public class MethodOverriding2 {
    public static void main(String[] args) {
        Circle c = new Circle();
        c.draw();
        Square s = new Square();
        s.draw();
    }
}
