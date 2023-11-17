
// todo: WAP to print factors of a given number. (Using For Loop)
import java.util.Scanner;

public class FactorOfNumber_For_Loop {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter The Number you want factors : ");
        int num = sc.nextInt();
        for (int i = 1; i <= num; i++) {
            if (num % i == 0) {
                System.out.print(i + " ,");
            }
        }
        sc.close();
    }
}
