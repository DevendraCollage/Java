// todo: Inheritance Demo (Single Inheritance)
class A {
    protected int i;
    int j;

    void showA() {
        System.out.println("i = " + i);
        System.out.println("j = " + j);
    }
}

class B extends A { // Inheritance
    int k;

    void showB() {
        System.out.println("k = " + k);
    }

    void add() {
        System.out.println("i+j+k = " + (i + j + k));
    }
}

public class InheritanceDemo {
    public static void main(String[] args) {
        // todo: Create object of Class A
        A a = new A();
        a.i = 10;
        a.j = 20;
        a.showA();

        // todo: Create object of Class B
        B b = new B();
        b.k = 10;
        b.showB();
        b.add();
    }
}