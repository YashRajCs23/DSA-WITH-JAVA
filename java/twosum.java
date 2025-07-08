// take an array from a user and print all the pair whose sum is equal to t
//take a sorted array
        class Solution {
            public int[] twoSum(int[] nums, int target) {
                int n = nums.length;
                for (int i = 0; i < n - 1; i++) {
                    for (int j = i + 1; j < n; j++) {
                        if (nums[i] + nums[j] == target) `{
                            return new int[]{i, j};
                        }
                    }
                }
                return new int[]{}; // No solution found
            }
        }

// array sorted

import java.util.Scanner;

public class PairSum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the size of the array: ");
        int n = scanner.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }
        System.out.print("Enter the target sum: ");
        int t = scanner.nextInt();

        printPairs(arr, t);
    }

    public static void printPairs(int[] arr, int t) {
        int left = 0;
        int right = arr.length - 1;

        while (left < right) {
            int sum = arr[left] + arr[right];
            if (sum == t) {
                System.out.println("Pair found: (" + arr[left] + ", " + arr[right] + ")");
                left++;
                right--;
            } else if (sum < t) {
                left++;
            } else {
                right--;
            }
        }
    }
}