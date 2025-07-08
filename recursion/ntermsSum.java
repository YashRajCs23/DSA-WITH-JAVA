import java.util.Scanner;
public class ntermsSum {
    public static int sum(int n){
        if(n==0)return n;
        return n+sum(n-1);
    }
    public static int facorial(int n){
        if(n==1)return 1;
        return n*facorial(n-1);
    }
    static int oddsum(int n){
        if(n==0)return 0;
        return (2*n-1)+oddsum(n-1);
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        sum(n);
        facorial(n);
        oddsum(n);
    }
}