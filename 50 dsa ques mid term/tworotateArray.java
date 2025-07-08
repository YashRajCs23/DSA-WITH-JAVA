import java.util.Scanner;
public class tworotateArray{
    // Method to print the array
    public static void print(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
    // Method to take input for the array
    public static void input(int[] arr) {
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
    }
    // Method to left rotate the array by 1 step
    public static void leftRotate(int[] arr) {
        int n = arr.length;
        int temp = arr[0]; // Store the first element
        for (int i = 0; i < n - 1; i++) {
            arr[i] = arr[i + 1]; // Shift elements to the left
        }
        arr[n - 1] = temp; // Place the first element at the end
    }
    // Method to right rotate the array by 1 step
    public static void rightRotate(int[] arr) {
        int n = arr.length;
        int temp = arr[n - 1]; // Store the last element
        for (int i = n - 1; i > 0; i--) {
            arr[i] = arr[i - 1]; // Shift elements to the right
        }
        arr[0] = temp; // Place the last element at the beginning
    }
    // Method to left rotate the array by k steps (optimized)
    public static void leftKsteps(int[] arr, int k) {
        int n = arr.length;
        k = k % n; // Handle cases where k > n
        reverse(arr, 0, k - 1); // Reverse the first k elements
        reverse(arr, k, n - 1); // Reverse the remaining elements
        reverse(arr, 0, n - 1); // Reverse the entire array
    }
    // Method to right rotate the array by k steps (optimized)
    public static void rightKsteps(int[] arr, int k) {
        int n = arr.length;
        k = k % n; // Handle cases where k > n
        reverse(arr, 0, n - 1); // Reverse the entire array
        reverse(arr, 0, k - 1); // Reverse the first k elements
        reverse(arr, k, n - 1); // Reverse the remaining elements
    }
    // Helper method to reverse a portion of the array
    public static void reverse(int[] arr, int start, int end) {
        while (start < end) {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }
    // Main method
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of the array: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter the elements of the array:");
        input(arr);
        System.out.println("Original Array:");
        print(arr);
        // Left rotate by 1 step
        leftRotate(arr);
        System.out.println("After Left Rotate by 1 step:");
        print(arr);
        // Right rotate by 1 step
        rightRotate(arr);
        System.out.println("After Right Rotate by 1 step:");
        print(arr);
        // Left rotate by k steps
        System.out.print("Enter the number of steps for left rotation: ");
        int k = sc.nextInt();
        leftKsteps(arr, k);
        System.out.println("After Left Rotate by " + k + " steps:");
        print(arr);
        // Right rotate by k steps
        System.out.print("Enter the number of steps for right rotation: ");
        k = sc.nextInt();
        rightKsteps(arr, k);
        System.out.println("After Right Rotate by " + k + " steps:");
        print(arr);
    }
}