import java.util.Scanner;
public class integerSum {
    public static void subsetSum(int[] a,int n,int idx,int sum){
        if(idx>=n){
            System.out.println(sum);
            return;
        }
        subsetSum(a, n, idx+1, sum+a[idx]);
        subsetSum(a, n, idx+1, sum);
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        subsetSum(arr,n,0,0);
    }
}