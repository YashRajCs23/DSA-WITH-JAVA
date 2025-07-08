import java.util.*;

public class CountingOccurrences {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Read inputs for counting occurrences in number
        int n = sc.nextInt();
        int k = sc.nextInt();

        int count = 0;
        int originalN = n; // Store original value of n
        while (n > 0) {
            int rem = n % 10;
            if (rem == k) {
                count++;
            }
            n = n / 10;
        }
        System.out.println("Number of times 'k' is repeated is: " + count);

        // Read array size and elements
        n = originalN; // Restore original value of n
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        // Display results
        System.out.println("Count of occurrences of " + k + ": " + countOccurrences(arr, k));
        System.out.println("Last occurrence of " + k + ": " + lastOccurrence(arr, k));
        System.out.println("Is array sorted? " + isSorted(arr));
        
        if (k >= 0 && k < arr.length) {
            System.out.println("Element at index " + k + ": " + arr[k]);
        } else {
            System.out.println("Index " + k + " is out of bounds.");
        }
        
        if (arr.length - k - 1 >= 0 && arr.length - k - 1 < arr.length) {
            System.out.println("Element at index " + (arr.length - k - 1) + ": " + arr[arr.length - k - 1]);
        } else {
            System.out.println("Index " + (arr.length - k - 1) + " is out of bounds.");
        }
    }

    static int countOccurrences(int[] arr, int k) {
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == k) {
                count++;
            }
        }
        return count;
    }

    static int lastOccurrence(int[] arr, int k) {
        int lastIndex = -1;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == k) {
                lastIndex = i;
            }
        }
        return lastIndex;
    }

    static boolean isSorted(int[] arr) {
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < arr[i - 1]) {
                return false;
            }
        }
        return true;
    }

    static int[] minAndMax(int[] arr) {
        Arrays.sort(arr);
        return new int[]{arr[0], arr[arr.length - 1]};
    }

    static int[] kthMinAndMax(int[] arr, int k) {
        Arrays.sort(arr);
        if (k < 0 || k >= arr.length) {
            throw new IllegalArgumentException("k is out of bounds");
        }
        return new int[]{arr[k], arr[arr.length - k - 1]};
    }
}
