// todo: Inheritance Demo (Multilevel Inheritance)
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
        System.out.println("Inside Class B, value of k = " + k);
    }

    void add() {
        System.out.println("i+j+k = " + (i + j + k));
    }
}

class C extends B {
    int l;

    void showC() {
        System.out.println("Inside Class C, value of l = " + l);
    }

    void sum() {
        System.out.println("i+j+k+l = " + (i + j + k + l));
    }
}

public class InheritanceMultilevel {
    public static void main(String[] args) {
        A a = new A();
        a.i = 10;
        a.j = 10;
        a.showA();

        B b = new B();
        b.i = 5;
        b.j = 5;
        b.k = 10;
        b.showB();
        b.add();

        C c = new C();
        c.i = 10;
        c.j = 20;
        c.k = 30;
        c.l = 40;
        c.showC();
        c.sum();
    }
}
