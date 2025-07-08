import java.util.Scanner;
public class mul {
    public static void mul(int n,int k){
        if (k==0) return;
        mul(n, k-1);
        System.out.println(n*k);
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt(),k=sc.nextInt();
        mul(n,k);
    }
}