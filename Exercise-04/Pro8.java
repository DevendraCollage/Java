
/*
 * There is an integer array nums sorted in ascending order (with distinct values).
 * Prior to being passed to your function, nums is possibly rotated at an unknown pivot
 * index k (1 <= k < nums.length) such that the resulting array is [nums[k], 
 * nums[k+1], ..., nums[n-1], nums[0], nums[1], ..., nums[k-1]] (0-indexed).
 *  For example, [0,1,2,4,5,6,7] might be rotated at pivot index 3 and become
 *  [4,5,6,7,0,1,2].Given the array nums after the possible rotation and an integer target,
 *  return the index of target if it is in nums, or -1 if it is not in nums.
 */
import java.util.Scanner;

public class Pro8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter The Size of an Array : ");
        int size = sc.nextInt();
        int arr[] = new int[size]; // This Dynamic Array Passing
        int temp[] = new int[size];
        for (int i = 0; i < arr.length; i++) { // This loop will get the array elements from the user
            System.out.printf("Enter Array Element [%d] : ", i);
            arr[i] = sc.nextInt();
        }
        System.out.print("Enter Rotation Of The Array : ");
        int rotate = sc.nextInt();
        System.out.print("Enter The Search Element : ");
        int search = sc.nextInt();
        int pointer = 0;
        for (int i = rotate; i < arr.length; i++) {
            temp[pointer] = arr[i];
            pointer++;
        }
        for (int i = 0; i < rotate; i++) {
            temp[pointer] = arr[i];
            pointer++;
        }
        boolean flag = true;
        int index = 0;
        for (int i = 0; i < temp.length; i++) {
            if (temp[i] == search) {
                flag = false;
                index = i;
                break;
            }
        }
        if (flag == false) {
            System.out.println("Location Os The Index : " + index);
        } else {
            System.out.println("-1");
        }
        sc.close();
    }
}
