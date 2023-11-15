// todo: Write a program that creates and initializes a four integer element array. Calculate and display the average of its values.
public class Array_Average {
    public static void main(String[] args) {
        int arr[] = new int[4];
        arr[0] = 10;
        arr[1] = 55;
        arr[2] = 5;
        arr[3] = 10;
        int sum = 0;
        float average;
        for (int i = 0; i < arr.length; i++) {
            sum = sum + arr[i];
        }
        System.out.println("The Sum of Array Elements Are : " + sum);
        average = sum / arr.length;
        System.out.println("The Average Of Array Elements Is : " + average);
    }
}
