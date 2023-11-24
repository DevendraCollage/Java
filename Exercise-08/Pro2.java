/*
 * Write a complete program to accept N integer numbers from the command line. 
 * Raise and handle exceptions for following cases :
a. - when a number is –ve
b. - when a number is evenly divisible by 10
c. - when a number is greater than 1000 and less than 2000
d. - when a number is greater than 7000
Skip the number if an exception is raised for it, otherwise add it to find total sum.
 */
class First extends Exception {
    First(String msg) { // This is Constructor
        super(msg); // This will call the Exception
    }
}

class Second extends Exception {
    Second(String msg) {
        super(msg);
    }
}

class Third extends Exception {
    Third(String msg) {
        super(msg);
    }
}

class Fourth extends Exception {
    Fourth(String msg) {
        super(msg);
    }
}

public class Pro2 {
    public static void main(String[] args) throws Fourth, Third, Second {
        try {
            // int n = Integer.parseInt(args[0]);
            // int i;
            int sum = 0;
            for (int j = 0; j <= args.length; j++) {
                if (Integer.parseInt(args[j]) < 0) {
                    throw new First("Number is -VE");
                } else if (Integer.parseInt(args[j]) % 10 == 0) {
                    throw new Second("Number is evenly divisible by 10");
                } else if (Integer.parseInt(args[j]) > 1000 && Integer.parseInt(args[j]) < 2000) {
                    throw new Third("Number Is Greater Than 1000 and Less Than 2000");
                } else if (Integer.parseInt(args[j]) > 7000) {
                    throw new Fourth("Number is Greater Than 7000!");
                } else {
                    sum = sum + Integer.parseInt(args[j]);
                }
            }
        } catch (First f1) {
            System.out.println(f1.getMessage());
        } catch (Second s1) {
            System.out.println(s1.getMessage());
        } catch (Third t1) {
            System.out.println(t1.getMessage());
        } catch (Fourth f1) {
            System.out.println(f1.getMessage());
        }
    }
}
