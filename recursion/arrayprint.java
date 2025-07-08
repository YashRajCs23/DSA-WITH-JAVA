import java.util.Scanner;
public class arrayprint {
    public static void print(int arr[],int idx){
        if(idx==arr.length) return;
        System.out.println(arr[idx]);
        print(arr, idx+1);
    }
     public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
}
}