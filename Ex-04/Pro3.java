
// todo: Write a program to print given array in reverse order.
import java.util.Scanner;

public class Pro3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter The Size of Array : ");
        int size = sc.nextInt();
        int arr[] = new int[size]; // this is an dynamic array
        for (int i = 0; i < arr.length; i++) {
            System.out.printf("Enter element[%d] : ", i, "\n");
            arr[i] = sc.nextInt();
        }
        System.out.println("Array Print In Reverse!");
        for (int i = arr.length - 1; i >= 0; i--) {
            System.out.printf("Element[%d] : %d", i, arr[i]);
            System.out.println();
        }
        sc.close();
    }
}
