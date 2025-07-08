
import java.util.Scanner;

public class selectsort {
    static void select(int [] arr){
        int n=arr.length;
        for (int i = 0; i < n; i++) {
            int mx=i;
            for(int j=i;j<n;j++){
                if(arr[mx]>arr[j]){
                    mx=j;
                }
            }
            int temp=arr[i];
            arr[i]=arr[mx];
            arr[mx]=temp;
        }
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int []arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        select(arr);
        for(int i=0;i<n;i++){
            System.out.println(arr[i]);
        }
    }
}
