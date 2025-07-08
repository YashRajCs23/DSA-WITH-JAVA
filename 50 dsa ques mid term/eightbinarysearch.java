public class eightbinarysearch {
    public static int findSmallestIndex(int[] arr, int target) {
        return findFirstOccurrence(arr, target);
    }
    public static int findFirstOccurrence(int[] arr, int target) {
        int start = 0, end = arr.length - 1;
        int result = -1; // Initialize result to -1 (target not found)
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (arr[mid] == target) {
                result = mid; // Update result to the current index
                end = mid - 1; // Continue searching in the left half
            } else if (arr[mid] < target) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }
        return result; // Returns the smallest index or -1 if not found
    }
}