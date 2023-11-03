// todo: Dynamic Method Dispatch Example
class A {
    void display() {
        System.out.println("Inside Class A!");
    }
}

class B extends A {
    void display() {
        System.out.println("Inside Class B!");
    }
}

class C extends A {
    void display() {
        System.out.println("Inside Class C!");
    }
}

public class DynamicMethodDispatch {
    public static void main(String[] args) {
        // Also these works!
        A r = new A();
        B r1 = new B();
        C r2 = new C();
        // A r; // Obtain a reference of type a

        // r = a;
        r.display();

        // r = b;
        r1.display();

        // r = c;
        r2.display();
    }
}
