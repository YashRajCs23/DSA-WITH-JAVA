import java.util.Scanner;
public class factorial {
    public static int fact(int n){
        if (n==0 || n==1) return 1;
        return n*fact(n-1);
    }
    public static void print(int n){
        if (n==0) return;
        System.out.println(n+" ");
        print(n-1);
        }
    public static void printIncreasing(int x,int n){
        if (x>n) return;
        System.out.println(x+" ");
        printIncreasing(x+1, n);
        }
    public static void printInc(int n){
        if(n==0) return;
        printInc(n-1);
        System.out.println(n);
    }
    public static void sum(int n,int s){
        if(n==0){
            System.out.println(s);
            return;
        }
        sum(n-1, s+n);
    }
    public static int sumRecuu(int n){
        if(n<=1) return n;
        return n+sumRecuu(n-1);
    }
    public static int pow(int a,int b){
        if(b==0) return 1;
        return a*pow(a, b-1);
    }
    public static int pow2(int a,int b){
        if(b==0) return 1;
        int ans=pow2(a, b/2);
        if(b%2==0) return ans*ans;
        else return ans*ans*a;
    }
        
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        System.out.println(fact(n));
        print(n);
        printIncreasing(1, n);
        printInc(n);
        sum(n, 0);
        sumRecuu(n);
        int a=sc.nextInt(),b=sc.nextInt();
        pow(a, b);
        pow2(a, b);
    }
}