
// todo: Write a program that creates and initializes a four integer element array. Calculate and display the average of its values.
public class Pro2 {
    public static void main(String[] args) {
        int num[] = { 10, 20, 30, 40 };
        int sum = 0;
        for (int i = 0; i < num.length; i++) {
            sum = sum + num[i];
        }
        System.out.println("Sum of array elements is : " + sum);
        double average = sum / num.length;
        System.out.println("Average of array elements is : " + average);
    }
}
