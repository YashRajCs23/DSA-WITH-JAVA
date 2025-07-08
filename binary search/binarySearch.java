import java.util.*;
public class binarySearch {
    public static void print(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
    public static void input(int[] arr, Scanner sc) {
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
    }
    public static boolean binarySearch(int[] arr, int target) {
            int low = 0, high = arr.length - 1;
            boolean flag = false;   
            while (low <= high) {
                int mid = (low + high) / 2;  
                if (arr[mid] < target) {
                    low = mid + 1;
                } else if (arr[mid] > target) {
                    high = mid - 1;
                } else {
                    flag = true;
                    break;
                }
            } 
            return flag;
        }
    public static int lowerBound(int[] arr, int target) {
        int low = 0, high = arr.length; // Notice high = arr.length, not arr.length - 1
        while (low < high) { // Use < instead of <=
            int mid = low + (high - low) / 2;
            if (arr[mid] < target) {
                low = mid + 1; // Move right
            } else {
                high = mid; // Move left, including mid as a possible answer
            }
        }
        return low;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);       
        int n = sc.nextInt();
        int[] arr = new int[n];
        input(arr, sc);       
        Arrays.sort(arr);
        int target = sc.nextInt();
        print(arr);
        boolean found = binarySearch(arr, target);
        System.out.println(found ? "true" : "false");
        lowerBound(arr, target);
    }
}