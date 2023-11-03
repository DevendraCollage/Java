// todo: Method Overloading
class Addition {
    int i, j, k;

    void add(int a) {
        i = a;
        System.out.println("i = " + i);
    }

    void add(int a, int b) {
        i = a;
        j = b;
        System.out.println("i+j = " + (i + j));
    }

    void add(int a, int b, int c) {
        i = a;
        j = b;
        k = c;
        System.out.println("i+j+k = " + (i + j + k));
    }
}

public class MethodOverloading {
    public static void main(String[] args) {
        Addition a = new Addition();
        a.add(10);
        a.add(10, 10);
        a.add(10, 10, 10);
    }
}
