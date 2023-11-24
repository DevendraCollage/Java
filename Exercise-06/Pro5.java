// todo: Demonstrate the use of Super Keyword.
class Animal {
    public void sound() {
        System.out.println("Dog Is Barking!");
    }
}

class Cat extends Animal {
    public void sound() {
        super.sound(); // Call the sound method from Animal class
        System.out.println("Cat Is Meow!");
    }
}

public class Pro5 {
    public static void main(String[] args) {
        Cat cat = new Cat();
        cat.sound();
    }
}
