
// WAP to add two numbers using add(int,int) Function
import java.util.Scanner;

class Add {
    int a;
    int b;

    public int add(int a, int b) {
        return a + b;
    }
}

public class AddTwoNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Add a1 = new Add();
        System.out.print("Enter The First Number : ");
        a1.a = sc.nextInt();
        System.out.print("Enter The Second Number : ");
        a1.b = sc.nextInt();
        System.out.printf("The Addition of %d + %d = %d", a1.a, a1.b, (a1.a + a1.b));
        sc.close();
    }
}
