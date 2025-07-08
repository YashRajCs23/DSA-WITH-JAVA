import java.util.Scanner;

public class Rotate_Array_leet {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter length of Array: ");
        int n = input.nextInt();

        int[] nums = new int[n];
        int[] arr = new int[n];
        int j = 0;

        System.out.print("Enter the elements of the Array: ");
        for (int i = 0; i < n; i++) {
            nums[i] = input.nextInt();
        }

        System.out.print("Enter the value of K: ");
        int k = input.nextInt();
        k = k % n;
        int idx = nums.length - k;

        for (int i = idx; i < nums.length; i++) {
            arr[j] = nums[i];
            j++;
        }
        for (int i = 0; i < idx; i++) {
            arr[j] = nums[i];
            j++;
        }

        System.out.print("Your Rotated Array is: ");
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
 }
}
}