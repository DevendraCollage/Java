
// todo: Write a program to convert temperature from Fahrenheit to Celsius. (Formula : c = f-32*5/9 )
import java.util.Scanner;

public class Temperature {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter The Temperature In Fahrenheit : ");
        float temperature = sc.nextFloat();
        float celsius = (temperature - 32) * 5 / 9;
        System.out.println("The Temperature Converted In Celsius is : " + celsius);
        sc.close();
    }
}
