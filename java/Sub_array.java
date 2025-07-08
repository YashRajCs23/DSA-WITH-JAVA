import java.util.*;
public class Sub_array{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int arr[] = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i]=sc.nextInt();   
        }
//gpt 
        // for (int i = 0; i < arr.length; i++) {
        //     for (int j = i; j < arr.length; j++) {
        //         for (int k = i; k <= j; k++) {
        //             System.out.print(arr[k] + " ");
        //         }
        //         System.out.println();
        //     }
        // }
//sir
        for(int i=0;i<n;i++){
            for (int j = i; j < n; j++) {
                for (int k = i; k <=j; k++) {
                    System.out.print(arr[k]+" ");
                }
                System.out.println();
            }
        }
    }
}