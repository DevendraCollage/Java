// Demo of Method Overloading (Compile-Time Polymorphism)
class Addition {
    int i, j, k;

    void add(int a) {
        i = a;
        System.out.println("The Value of i Is : " + i);
    }

    void add(int a, int b) {
        i = a;
        j = b;
        System.out.println("The Value of i and j Is : " + (i + j));
    }

    void add(int a, int b, int c) {
        i = a;
        j = b;
        k = c;
        System.out.println("The Value of i, j and k Is : " + (i + j + k));
    }
}

public class DemoMethodOverloading {
    public static void main(String[] args) {
        Addition a1 = new Addition();
        a1.add(10);
        a1.add(10, 20);
        a1.add(10, 20, 30);
    }
}
