import java.util.Scanner;
public class maxValueinString {
    public String findMaxValueInArray(String[] arr) {
        String maxValue = arr[0];
        for (String s : arr) {
            if (Integer.parseInt(s) > Integer.parseInt(maxValue)) {
                maxValue = s;
            }
        }
        return maxValue;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of strings: ");
        int n = sc.nextInt();
        sc.nextLine();
        String[] arr = new String[n];
        System.out.println("Enter the numeric values:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextLine();
        }
        maxValueinString solution = new maxValueinString();
        String maxValue = solution.findMaxValueInArray(arr);
        System.out.println("The maximum value is: " + maxValue);
    }
}