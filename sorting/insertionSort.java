import java.util.Scanner;
public class insertionSort {
    public static void print(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+" ");
        }
    }    
    public static void input(int[] arr) {
        Scanner sc=new Scanner (System.in);
        for (int i = 0; i < arr.length; i++) {
            arr[i]=sc.nextInt();
        }
    } 
    public static void swap(int[] arr,int i,int j){
        int temp=arr[i];
        arr[i]=arr[j];
        arr[j]=temp;
    } 
    public static void insertSort(int[] arr){
        int n=arr.length;
        for(int i=1;i<n;i++){
            for(int j=i;j>=1;j--){
                if(arr[j]<arr[j-1]){
                   swap(arr,j,j-1);
                }
            }
        }
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner (System.in);
        int n=sc.nextInt();
        int [] arr=new int[n];
        input(arr); 
        insertSort(arr);
        print(arr);
}
}