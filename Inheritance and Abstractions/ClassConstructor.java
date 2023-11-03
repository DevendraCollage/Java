// todo: Inheritance Demo (Class With Constructor)
class Cube {
    protected double height, width, depth;

    Cube() { // Constructor of Cube class
        System.out.println("Inside Default Constructor Cube!");
    }

    double volume() {
        return height * width * depth;
    }
}

class CubeWeight extends Cube {
    double weight;

    CubeWeight(double h, double w, double d, double m) { // Constructor with parameter (Parameterized Constructor)
        System.out.println("Inside Parameterized Constructor CubeWeight!");
        height = h;
        width = w;
        depth = d;
        weight = m;
    }
}

public class ClassConstructor {
    public static void main(String[] args) {
        CubeWeight c1 = new CubeWeight(10, 20, 10, 10);
        CubeWeight c2 = new CubeWeight(20, 20, 20, 10);
        System.out.println("c1.volume = " + c1.volume());
        System.out.println("c2.volume = " + c2.volume());
    }
}
