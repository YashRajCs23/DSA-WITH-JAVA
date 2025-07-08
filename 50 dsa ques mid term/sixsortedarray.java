import java.util.Scanner;
public class sixsortedarray {
        public static void print(int[] arr){
        for(int i=0;i<arr.length;i++){
            System.out.println(arr[i]);
        }
        System.out.println();
    }
    public static void input(int[] arr){
        Scanner sc=new Scanner(System.in);
        for(int i=0;i<arr.length;i++){
            arr[i]=sc.nextInt();    
        }
    }
    public static boolean sorted(int[] arr){
        int n=arr.length;
        if(n==0 || n==1)return true;
        for(int i=1;i<n;i++){
            if(arr[i-1]>arr[i]) return false;
        }
        return true;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr=new int[n];
        input(arr);
        sorted(arr);
    }
}
