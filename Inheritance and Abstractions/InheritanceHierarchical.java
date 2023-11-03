// todo: Inheritance Demo (Hierarchical Inheritance)
class A {
    protected int i;
    int j;

    void showA() {
        System.out.println("Inside Class A, and value of i = " + i);
        System.out.println("Inside Class A, and value of j = " + j);
    }
}

class B extends A {
    int k;

    void showB() {
        System.out.println("Inside Class B, and value of K = " + k);
    }

    void add() {
        System.out.println("i+j+k = " + (i + j + k));
    }
}

class C extends A {
    int l;

    void showC() {
        System.out.println("Inside Class C, and value of l = " + l);
    }

    void sum() {
        System.out.println("i+j+l = " + (i + j + l));
    }
}

public class InheritanceHierarchical {
    public static void main(String[] args) {
        A a = new A();
        a.i = 10;
        a.j = 5;
        a.showA();

        B b = new B();
        b.i = 10;
        b.j = 5;
        b.k = 10;
        b.showB();
        b.add();

        C c = new C();
        c.i = 10;
        c.j = 50;
        c.l = 5;
        c.showC();
        c.sum();
    }
}