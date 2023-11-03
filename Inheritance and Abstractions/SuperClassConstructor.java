// todo: Inheritance (Call Super Class Constructor)
class A {
    protected double height, width, depth;

    A(double h, double w, double d) {
        System.out.println("Inside Constructor A!");
        height = h;
        width = w;
        depth = d;
    }

    double volume() {
        return height * width * depth;
    }
}

class B extends A {
    double weight;

    B(double h, double w, double d, double m) {
        super(h, w, d); // This is called super class constructor
        System.out.println("Inside Constructor B!");
        weight = m;
    }
}

public class SuperClassConstructor {
    public static void main(String[] args) {
        B b = new B(10, 10, 10, 20);
        B b1 = new B(100, 100, 100, 200);
        System.out.println("b.volume = " + b.volume());
        System.out.println("b.weight = " + b.weight);
        System.out.println("b1.volume = " + b1.volume());
        System.out.println("b1.weight = " + b1.weight);
    }
}
