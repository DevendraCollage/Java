/*
 * Write a program that illustrates interface inheritance. Interface A is extended by A1
 *  and A2. Interface A12 inherits from both P1 and P2.Each interface declares one constant
 *  and one method. Class B implements A12.Instantiate B and invoke each of its methods. 
 * Each method displays one of the constants
 */
interface A1 {
    public static final int a1 = 1;

    public void m1();
}

interface A2 {
    public static final int a2 = 2;

    public void m2();
}

interface A extends A1, A2 {

}

interface P1 {
    public static final int p1 = 10;

    public void m3();
}

interface P2 {
    public static final int p2 = 20;

    public void m4();
}

interface P12 extends P1, P2, A {

}

class Sample implements P12 { // Compulsory implement all the method of the interface
    public void m1() {
        System.out.println("Inside the Method : A1");
    }

    public void m2() {
        System.out.println("Inside the Method : A2");
    }

    public void m3() {
        System.out.println("Inside The Method : M1");
    }

    public void m4() {
        System.out.println("Inside The Method : M2");
    }
}

public class Pro2 {
    public static void main(String[] args) {
        Sample s = new Sample();
        s.m1();
        s.m2();
        s.m3();
        s.m4();
    }
}
