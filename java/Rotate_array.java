import java.util.*;
public class Rotate_array {
    
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n = sc.nextInt();

        int[] arr=new int[n];
        for (int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        int temp=arr[n-1];
        for(int i=n-2; i>=0; i--){
            arr[i+1]=arr[i];
        }
       
        for(int j=0;j<n;j++){
            System.out.print(arr[j]);
        }

        int m=sc.nextInt();
        int[] arr1=new int[m];
        for(int i=0;i<m;i++){
            arr1[i]=sc.nextInt();
        }

        int tempe=arr1[m-1];
        for(int i=m-2;i>=0;i--){
            arr1[i+1]=arr1[i];
        }

        for (int j = 0; j < n; j++) {
            System.out.println(arr[j]);
        }
}
}
