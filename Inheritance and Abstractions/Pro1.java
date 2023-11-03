/*
 * todo: Define an interface direction (Method: east, west, north, south) define
 * a class name Car which implements directions interface. Print Appropriate
 * message derive 2 objects for (c1, c2);
 */
interface Direction {
    public void east();

    public void west();

    public void north();

    public void south();
}

class Car implements Direction {
    public void east() {
        System.out.println("Car is moving east!");
    }

    public void west() {
        System.out.println("Car is moving west!");
    }

    public void north() {
        System.out.println("Car is moving north!");
    }

    public void south() {
        System.out.println("Car is moving south!");
    }
}

public class Pro1 {
    public static void main(String[] args) {
        // create two car objects
        Car c1 = new Car();
        Car c2 = new Car();
        // call the methods of each object to print appropriate messages
        c1.east();
        c1.west();
        c1.north();
        c1.south();
        c2.east();
        c2.west();
        c2.north();
        c2.south();
    }
}