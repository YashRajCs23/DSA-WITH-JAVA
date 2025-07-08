import java.util.Scanner;

public class prime {

    public static boolean prime(int n) {
        if (n <= 1) return false;
        if (n == 2) return true;
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static int hcf(int a, int b) {
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }

    public static int findHCFForArray(int[] arr) {
        int hcf = arr[0];
        for (int i = 1; i < arr.length; i++) {
            hcf = hcf(hcf, arr[i]);
        }
        return hcf;
    }

    public static int findLcm(int a, int b) {
        return (a * b) / hcf(a, b);
    }

    public static int lcms(int[] arr) {
        int lcm = arr[0];
        for (int i = 1; i < arr.length; i++) {
            lcm = findLcm(lcm, arr[i]);
        }
        return lcm;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number to check for prime: ");
        int num = sc.nextInt();
        System.out.println("Is " + num + " a prime number? " + prime(num));

        System.out.print("Enter the size of the array: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.println("HCF of the array: " + findHCFForArray(arr));
        System.out.println("LCM of the array: " + lcms(arr));
    }
}
