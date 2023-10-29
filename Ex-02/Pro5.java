
// todo: Write a program to convert temperature from Fahrenheit to Celsius. (Formula : c = f-32*5/9 )
import java.util.Scanner;

public class Pro5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter The Temperature in Fahrenheit : ");
        float temp = sc.nextFloat();
        float cel = (temp - 32) * 5 / 9;
        System.out.println("The Temperature Converted Into Celsius Is : " + cel);
        sc.close();
    }
}
