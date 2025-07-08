import java.util.Scanner;
public class fivemajorityelement {
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
    // public static void majority(int[] arr,int x){
    //     int n=arr.length;
    //     int count=0;
    //     for(int i=0;i<n;i++){
    //         if(arr[i]==x) count++;
    //     }
    //     if(count>(n/2)) System.out.println(x);
    // }
    public static int moores_voting_algo(int[] arr){
        int cnt=0;
        int el=0;
        for(int i=0;i<arr.length;i++){
            if(cnt==0){
                cnt=1;
                el=arr[i];
            }
            else if(arr[i]==el){
                cnt++;
            }
            else{
                cnt--;
            }
        }
        int cnt1=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]==el) cnt1++;
        }
        if(cnt1>(arr.length/2)) return el;
        else return -1;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr=new int[n];
        input(arr);
        moores_voting_algo(arr);
    }
}