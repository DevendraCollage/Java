
// todo: Wrapper class Example (Boxing and Unboxing)
import java.util.Scanner;

public class Pro2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // Get the input from the user
        System.out.print("Enter The Integer Number Here : ");
        int num = sc.nextInt();

        // Create a wrapper object for the num
        // valueOf is used to convert primitive type to Wrapper class for that given
        // primitive
        Integer number = Integer.valueOf(num);

        // Print the value of the Wrapper object
        System.out.println("The value of the integer is : " + number);

        // Auto-boxing - parseInt is a method of Integer Wrapper class
        Integer anotherInteger = number;
        System.out.println("Boxed Integer : " + anotherInteger);
        System.out.println(anotherInteger.getClass());

        // Auto-unboxing
        int unboxedNumber = anotherInteger;
        System.out.println("Unboxed Integer : " + unboxedNumber);
        sc.close();
    }
}