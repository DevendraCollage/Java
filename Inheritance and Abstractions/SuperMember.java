// todo: Inheritance (Using Super Access Member of Super Class)
class A {
    int i;
}

class B extends A {
    int i, k;

    B(int a, int b) {
        super.i = a; // This can access members i of super class A
        this.i = b; // This can access members i of sub class B
    }

    void show() {
        System.out.println("Super.i = " + super.i);
        System.out.println("This.i = " + this.i);
    }
}

public class SuperMember {
    public static void main(String[] args) {
        B b = new B(10, 20);
        b.show();
    }
}
