import java.util.*;

public class ArrayOperations {

    // Function to take user input for an array
    public static int[] takeInput(int size) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[size];
        System.out.println("Enter " + size + " elements:");
        for (int i = 0; i < size; i++) {
            arr[i] = sc.nextInt();
        }
        return arr;
    }

    // Function to find maximum and minimum in an array
    public static void findMinMax(int[] arr) {
        int max = arr[0], min = arr[0];
        for (int num : arr) {
            if (num > max) max = num;
            if (num < min) min = num;
        }
        System.out.println("Maximum: " + max + ", Minimum: " + min);
    }

    // Function to reverse an array in-place
    public static void reverseArray(int[] arr) {
        int left = 0, right = arr.length - 1;
        while (left < right) {
            int temp = arr[left];
            arr[left] = arr[right];
            arr[right] = temp;
            left++;
            right--;
        }
    }

    // Function to rotate array by k steps
    public static void rotateArray(int[] arr, int k) {
        k %= arr.length;
        reversePart(arr, 0, arr.length - 1);
        reversePart(arr, 0, k - 1);
        reversePart(arr, k, arr.length - 1);
    }

    // Helper to reverse part of array
    private static void reversePart(int[] arr, int start, int end) {
        while (start < end) {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }

    // Count frequency of each element
    public static void countFrequency(int[] arr) {
        Map<Integer, Integer> freqMap = new HashMap<>();
        for (int num : arr) {
            freqMap.put(num, freqMap.getOrDefault(num, 0) + 1);
        }
        System.out.println("Element Frequencies: " + freqMap);
    }

    // Find second largest element
    public static int findSecondLargest(int[] arr) {
        int first = Integer.MIN_VALUE, second = Integer.MIN_VALUE;
        for (int num : arr) {
            if (num > first) {
                second = first;
                first = num;
            } else if (num > second && num != first) {
                second = num;
            }
        }
        return (second == Integer.MIN_VALUE) ? -1 : second;
    }

    // Check if array is sorted in ascending order
    public static boolean isSorted(int[] arr) {
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < arr[i - 1]) return false;
        }
        return true;
    }

    // Linear Search
    public static int linearSearch(int[] arr, int key) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == key) return i;
        }
        return -1;
    }

    // Binary Search (assumes sorted array)
    public static int binarySearch(int[] arr, int key) {
        int left = 0, right = arr.length - 1;
        while (left <= right) {
            int mid = left + (right - left) / 2;
            if (arr[mid] == key) return mid;
            if (arr[mid] < key) left = mid + 1;
            else right = mid - 1;
        }
        return -1;
    }

    // Bubble Sort
    public static void bubbleSort(int[] arr) {
        int n = arr.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
    }

    // Selection Sort
    public static void selectionSort(int[] arr) {
        int n = arr.length;
        for (int i = 0; i < n - 1; i++) {
            int minIndex = i;
            for (int j = i + 1; j < n; j++) {
                if (arr[j] < arr[minIndex]) minIndex = j;
            }
            int temp = arr[i];
            arr[i] = arr[minIndex];
            arr[minIndex] = temp;
        }
    }

    // First and last occurrence of a key in array
    public static int[] findFirstLastOccurrence(int[] arr, int key) {
        int first = -1, last = -1;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == key) {
                if (first == -1) first = i;
                last = i;
            }
        }
        return new int[]{first, last};
    }

    // Main function
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input array
        System.out.print("Enter array size: ");
        int size = sc.nextInt();
        int[] arr = takeInput(size);

        System.out.println("Original Array: " + Arrays.toString(arr));
        findMinMax(arr);

        // Reversing
        reverseArray(arr);
        System.out.println("Reversed Array: " + Arrays.toString(arr));

        // Rotation
        System.out.print("Enter rotation steps (k): ");
        int k = sc.nextInt();
        reverseArray(arr); // undo reverse to rotate original
        rotateArray(arr, k);
        System.out.println("Rotated Array: " + Arrays.toString(arr));

        countFrequency(arr);
        System.out.println("Second Largest Element: " + findSecondLargest(arr));
        System.out.println("Is Sorted: " + isSorted(arr));

        // Search operations
        System.out.print("Enter element to search: ");
        int key = sc.nextInt();
        System.out.println("Linear Search Index: " + linearSearch(arr, key));

        int[] sortedForBinary = Arrays.copyOf(arr, arr.length);
        bubbleSort(sortedForBinary);
        System.out.println("Sorted for Binary Search: " + Arrays.toString(sortedForBinary));
        System.out.println("Binary Search Index: " + binarySearch(sortedForBinary, key));

        // Sorting
        bubbleSort(arr);
        System.out.println("Bubble Sorted Array: " + Arrays.toString(arr));

        selectionSort(arr);
        System.out.println("Selection Sorted Array: " + Arrays.toString(arr));

        // First & Last Occurrence
        System.out.print("Enter element for first & last occurrence: ");
        int num = sc.nextInt();
        System.out.println("First & Last Occurrence: " + Arrays.toString(findFirstLastOccurrence(arr, num)));

        sc.close();
    }
}
