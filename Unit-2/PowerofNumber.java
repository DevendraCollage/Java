
// WAP to calculate the power of a number using method
import java.util.Scanner;

class Power { // Power Class
    public int Calpower(int a, int b) { // Calculate the power of number
        int r = 1;
        for (int i = 1; i <= b; i++) {
            r = r * a;
        }
        return r;
    }
}

public class PowerofNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Power p = new Power();
        System.out.print("Enter The Number : ");
        int num = sc.nextInt();
        System.out.print("Enter The Power Value : ");
        int pow = sc.nextInt();
        System.out.println("The Answer Is : " + p.Calpower(num, pow));
        sc.close();
    }
}
