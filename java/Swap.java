import java.util.*;
import javax.sound.sampled.SourceDataLine;


public class Swap {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n = sc.nextInt();

        int[] arr=new int[n];
        for (int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        // int first=arr[0];
        // int last=arr[n-1];
        // int temp=first;
        // first=last;
        // last=temp;


        System.out.println(reverseArray(arr));
        System.out.println(printArray(arr));
    }

    static void swapInArray(int[]arr, int i , int j){
        int temp = arr[i];
        arr[i]=arr[j];
        arr[j]=temp;
    }
    
    static void reverseArray(int[]arr){
        int i = 0;
        int j=arr.length-1;
        while(i<j){
            swapInArray(arr, i, j);
            i++;
            j--;
        }
    }
    
    
    static void printArray(int[]arr){
        int n=arr.length;
        for(int i=0;i<n;i++){
            System.out.println(arr[i]);
        }
        System.out.println();
    }
    
}