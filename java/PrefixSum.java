import java.util.*;

public class PrefixSum{

    static void printArray(int[]arr){
        int n=arr.length;
        for(int i=0;i<n;i++){
            System.out.print(arr[i]);
        }
        System.out.println();
    }
//by making a new array
    // static int[] makePrefixSumArray(int[]arr){
    //     int n = arr.length;
    //     int[] pref = new int[n];
    //     pref[0]=arr[0];
    //     for (int i = 1; i < n; i++) {
    //        pref[i]=pref[i-1]+arr[i]; 
    //     }
    //     return pref;
    // }


    // static int[] makePrefixSumArray(int[]arr){
    //         int n = arr.length;
    //         for (int i = 1; i < n; i++) {
    //         arr[i]=arr[i-1]+arr[i]; 
    //         }
    //         return arr;
    //     }
    static int[] SuffixWithoutNewArray(int[] arr) {
        for (int i = arr.length-1; i >= 2 ; i--) {
            arr[i-1] += arr[i];
        }
        return arr;
    }

    static int findArraySum(int[] arr){
        int totalsum=0;
        for (int i = 0; i < arr.length; i++) {
            totalsum+=arr[i];            
    }
    return totalsum;
}

    static boolean equalSumPartition(int[]arr){
        int totalsum=findArraySum(arr);
        int prefSum=0;
        for (int i = 0; i < arr.length; i++) {
            prefSum+=arr[i];

            int suffixSum = totalsum - prefSum;
            if(suffixSum==prefSum){
                return true;
            }
        }
        return false;
        }
    public static void main(String[] args) {
        Scanner sc  = new Scanner(System.in);
        int n = sc .nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i]=sc.nextInt();           
        }

        // printArray(arr);

        // int [] pref = makePrefixSumArray(arr);
        // printArray(pref);

        // makePrefixSumArray(arr);
        // printArray(arr);

        // int[] prefSum = makePrefixSumArray(arr);

        // System.out.println("enter no of queries");
        // int q=sc.nextInt();

        // while(q-->0){
        //     System.out.println("enter the range");
        //     int l =sc.nextInt();
        //     int r=sc.nextInt();

        //     int ans = prefSum[r]-prefSum[l-1];
        //     System.out.println("sum"+ans);

        System.out.println( SuffixWithoutNewArray(arr));

        System.out.println("equal partition possible"+equalSumPartition(arr));
        }
    }
// }