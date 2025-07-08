import java.util.Scanner;

public class conversion {
    // Convert Binary to Decimal
    public static int bintodec(int n) {
        int ans = 0;
        int power = 1;
        while (n > 0) {
            int unit_digit = n % 10;
            ans += (unit_digit * power);
            n /= 10;
            power *= 2;
        }
        return ans;
    }

    // Convert Decimal to Binary
    public static String dectobin(int n) {
        int i = 0;
        int[] arr = new int[32]; // Fixed size for a 32-bit integer
        StringBuilder binary = new StringBuilder();

        while (n > 0) {
            int rem = n % 2;
            arr[i] = rem;
            n /= 2;
            i++;
        }

        for (int j = i - 1; j >= 0; j--) {
            binary.append(arr[j]);
        }
        return binary.toString();
    }

    // Convert Decimal to Octal
    public static String dectooct(int n) {
        int i = 0;
        int[] arr = new int[32]; // Fixed size for a 32-bit integer
        StringBuilder octal = new StringBuilder();

        while (n > 0) {
            int rem = n % 8;
            arr[i] = rem;
            n /= 8;
            i++;
        }

        for (int j = i - 1; j >= 0; j--) {
            octal.append(arr[j]);
        }
        return octal.toString();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Binary to Decimal
        System.out.print("Enter a binary number: ");
        int binaryInput = sc.nextInt();
        System.out.println("Decimal value: " + bintodec(binaryInput));

        // Decimal to Binary
        System.out.print("Enter a decimal number to convert to binary: ");
        int decimalInput = sc.nextInt();
        System.out.println("Binary value: " + dectobin(decimalInput));

        // Decimal to Octal
        System.out.print("Enter a decimal number to convert to octal: ");
        int decimalForOctal = sc.nextInt();
        System.out.println("Octal value: " + dectooct(decimalForOctal));

        sc.close();
    }
}