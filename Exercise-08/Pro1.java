/*
 * Write a method for computing xy doing repetitive multiplication. X and y are of type 
 * integer and are to be given as command line arguments. Raise and handle exception(s) 
 * for invalid values of x and y.
 */
public class Pro1 {
    public static void main(String[] args) {
        int x, y;
        try { // If in this user can enter float or double value then pointer transfer to the
              // catch and print
            x = Integer.parseInt(args[0]);
            y = Integer.parseInt(args[1]);
            System.out.printf("The Multiplication Os %d * %d Is : %d", x, y, (x * y));
        } catch (Exception e) {
            System.out.println("The Value of X and Y are Invalid!");
        }
    }
}
