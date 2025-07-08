import java.util.Scanner;
public class selectwithKthmaxineachpass {
    public static void print(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }    
    public static void input(int[] arr) {
        Scanner sc=new Scanner (System.in);
        for (int i = 0; i < arr.length; i++) {
            arr[i]=sc.nextInt();
        }
    }  
    public static void sortKthmax(int[] arr) {
        int n = arr.length;
        for (int i = 0; i < n - 1; i++) {
            int maxIdx = 0;
            for (int j = 1; j < n - i; j++) {
                if (arr[j] > arr[maxIdx]) maxIdx = j;
            }
            print(arr);
            int temp = arr[maxIdx];
            arr[maxIdx] = arr[n - 1 - i];
            arr[n - 1 - i] = temp;
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int [] arr = new int[n];
        input(arr);
        sortKthmax(arr);
        print(arr);
        
    }
}