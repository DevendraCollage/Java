public class OperatorPrece {
    public static void main(String[] args) {
        // Demonstrate the operator precedence
        float first = 10 + 20 * 30;
        /*
         * = 10 + 600 // First Execute the 20 * 30 because multiplication get the higher
         * precedence then addition
         */
        System.out.println(first);
        float second = 100 / 10 * 100;
        /*
         * = 10 * 100 // First Execute the 100 / 10 because division and multiplication
         * get the equal
         * precedence then enter the associativity in this chapter (L -> R) Or (R <- L)
         */
        System.out.println(second);
        float third = 5 * 4 / 4 % 3;
        /*
         * Here Associativity Comes and then execute
         */
        System.out.println(third);
        float fourth = 100 + 200 / 10 - 3 * 10;
        System.out.println(fourth);
    }
}
