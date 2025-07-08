import java.util.Scanner;

public class Sub_array_sum_max {
public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n=sc.nextInt();
    int[] arr=new int[n];
    for(int i=0;i<n;i++){
        arr[i]=sc.nextInt();
    }
    // int max = Integer.MIN_VALUE;
    // int sum=0;
    // for (int i = 0; i < arr.length; i++) {
    //     for (int j = i; j < arr.length; j++) {
    //         for (int k = i; k <= j; k++) {
    //             sum = sum + arr[k];
    //         }
    //         if(sum>max){
    //             max=sum;
    //         }
    //         sum = 0;
    //     }
    // }
    // System.out.println(max);


    int max=Integer.MIN_VALUE;
        int sum=0;
        for(int i=0;i<n;i++){
            sum=0;
        for(int j=i;j<n;j++){
            sum=sum+arr[j];
            if(sum>max){
                max=sum;
            }
        }
        }
        System.out.print(max);


        }
}