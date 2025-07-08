import java.util.Scanner;
public class count {
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
    public static void main(String[] args) {
        Scanner sc=new Scanner (System.in);
        int n=sc.nextInt();
        int [] arr=new int[n];
        input(arr);
        print(arr);
        int x=0; 
        for(int i=0;i<n;i++){
            int min=Integer.MAX_VALUE;
            int mindx=0;
            for(int j=0;j<n;j++){
                if(arr[j]<min && arr[j]>0){
                    min=arr[j];
                    mindx=j;
                }
            }
            arr[mindx]=x;
            x--;
        }
        print(arr);
        for(int i=0;i<n;i++){
            arr[i]*=(-1);
        }
        print(arr);
    }
}