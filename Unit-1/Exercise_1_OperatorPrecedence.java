public class Exercise_1_OperatorPrecedence {
    public static void main(String[] args) {
        // Que-1
        int i = 1;
        i = 2 + 2 * i++;
        System.out.println(i); // Answer=4

        // Que-2
        int a = 2, b = 7;
        boolean c;
        c = a == b;
        System.out.println(c); // Answer=false

        // Que-3
        int a1 = 2, b1 = 7;
        boolean c1;
        c1 = a1 != b1;
        System.out.println(c1); // Answer=true

        // Que-4
        int a2 = 100 + 200 / 10 - 3 * 10;
        System.out.println(a2); // Answer=90

        // Que-5
        int a3 = 2, b3 = 6, c3 = 12, d;
        d = a3 * b3 + c3 / b3;
        System.out.println("The Value of D:" + d); // Answer=14
    }
}
