/*
 * The Transport interface declares a deliver () method. The abstract class Animal is the
 * super class of the Tiger, Camel, Deer and Donkey classes. The Transport interface is 
 * implemented by the Camel and Donkey classes. Write a test program that initialize an
 *  array of four Animal objects. If the object implements the Transport interface, 
 * the deliver () method is invoked.
 */
interface Transport { // Interface Method Without Body
    public void deliver();
}

abstract class Animal {
    abstract void display();
}

class Tiger extends Animal {
    void display() {
        System.out.println("The tiger is delivering");
    }
}

class Camel extends Animal implements Transport {
    public void deliver() {
        System.out.println("The camel is delivering");
    }

    Camel() { // Without Constructor deliver() method not called
        deliver();
    }

    void display() {
        System.out.println("Camel is delivering");
    }
}

class Deer extends Animal {
    void display() {
        System.out.println("Deer is delivering");
    }
}

class Donkey extends Animal implements Transport {
    public void deliver() {
        System.out.println("The Donkey is delivering");
    }

    Donkey() { // Without Constructor deliver() method not called
        deliver();
    }

    void display() {
        System.out.println("Donkey is delivering");
    }
}

public class Pro3 {
    public static void main(String[] args) {
        Animal a[] = new Animal[4];
        a[0] = new Tiger();
        a[0].display();

        a[1] = new Camel();
        a[1].display();

        a[2] = new Deer();
        a[2].display();

        a[3] = new Donkey();
        a[3].display();
    }
}
