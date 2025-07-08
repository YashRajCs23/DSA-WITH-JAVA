import java.util.Scanner;
public class sevensecondLargest {
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
    public static int max(int[] arr){
        if(arr.length==0)return 0;
        if(arr.length==1)return arr[0];
        int maxi=arr[0];
        for(int i=1;i<arr.length;i++){
            if(arr[i]>maxi) maxi=arr[i];
        }
        return maxi;
    }
    public static int secondlargest(int[] arr){
        int n=arr.length;
        int largest=arr[0];
        int slargest=-1;
        for(int i=1;i<n;i++){
            if(arr[i]>largest){
                slargest=largest;
                largest=arr[i];
            }
            else if(arr[i]<largest && arr[i]>slargest){
                slargest=arr[i];
            }
        }
        return slargest;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr=new int[n];
        input(arr);
    }
}
