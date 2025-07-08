import java.util.Scanner;
public class bubbleSort{
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
    public static void swap(int[] arr,int i,int j){
        int temp=arr[i];
        arr[i]=arr[j];
        arr[j]=temp;
    }  
    public static void sortBubble(int[] arr) {
        for(int x=1;x<arr.length-1;x++){
            for(int i=0;i<arr.length-1;i++){
                if(arr[i]>arr[i+1]){
                   swap(arr,i,i+1);
                }
            }
        }
    }
    public static void sortdesc(int[] arr) {
        for(int x=0;x<arr.length-1;x++){
            for(int i=0;i<arr.length-1;i++){
                if(arr[i]<arr[i+1]){
                    swap(arr,i,i+1);
                }
            }
        }
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner (System.in);
        int n=sc.nextInt();
        int [] arr=new int[n];
        input(arr);
        sortBubble(arr);
        print(arr);
        sortdesc(arr);
        print(arr);
}
}