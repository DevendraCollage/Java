public class CMDargumentsSum {
    public static void main(String[] args) {
        int num1 = Integer.parseInt(args[0]);
        int num2 = Integer.parseInt(args[1]);
        System.out.println("The Addition of " + num1 + " and " + num2 + " is: " + (num1 + num2));
        System.out.println("The Subtraction of " + num1 + " and " + num2 + " is: " + (num1 - num2));
        System.out.println("The Multiplication of " + num1 + " and " + num2 + " is: " + (num1 * num2));
        System.out.println("The Division of " + num1 + " and " + num2 + " is: " + (num1 / num2));
    }
}
