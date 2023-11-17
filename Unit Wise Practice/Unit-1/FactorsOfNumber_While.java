
// todo: WAP to print factors(Number Is Divisible Of Which Number) of a given numbers (While Loop)
import java.util.Scanner;

public class FactorsOfNumber_While {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter The Number You Want Factors : ");
        int num = sc.nextInt();
        int i = 1;
        while (i <= num) {
            if (num % i == 0) {
                System.out.print(i + ", ");
            }
            i++;
        }
        sc.close();
    }
}
