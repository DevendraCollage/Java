
/*
 * The abstract vegetable class has three subclasses named Potato, Brinjal and Tomato. 
 * Write a java program that demonstrates how to establish this class hierarchy. 
 * Declare one instance variable of type String that indicates the color of a vegetable. 
 * Crete and display instances of these objects. Override the toString() method of object
 *  to return a string with the name of vegetable and its color.
 */
import java.util.Scanner;

abstract class Vegetable {
    String color;

    abstract public String toString();
}

class Potato extends Vegetable {
    public String toString() {
        color = "Yellow";
        return color;
    }
}

class Brinjal extends Vegetable {
    public String toString() {
        color = "Purple";
        return color;
    }
}

class Tomato extends Vegetable {
    public String toString() {
        color = "Red";
        return color;
    }
}

public class Pro1 {
    public static void main(String[] args) {
        Vegetable p = new Potato(); // Dynamic Method Dispatch
        System.out.println("Color of Potato Is : " + p.toString());

        Vegetable b = new Brinjal(); // Dynamic Method Dispatch
        System.out.println("Color of Brinjal Is : " + b.toString());

        Vegetable t = new Tomato(); // Dynamic Method Dispatch
        System.out.println("Color of Tomato Is : " + t.toString());
    }
}
