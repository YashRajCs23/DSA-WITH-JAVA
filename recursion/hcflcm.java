import java.util.*;
public class hcflcm {
    public static void hcf(int x,int y){
        if(y==0) return;
        while(x%y!=0){
            int rem=x%y;
            x=y;
            y=rem;
        }
    }
    public static int gcd(int x, int y) {
        if (y == 0) return x;
        return gcd(y, x % y);
    }
    public static int lcm(int x, int y) {
        return (x * y) / gcd(x, y);
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int x=sc.nextInt(),y=sc.nextInt();
        hcf(x,y);
        gcd(x, y);
        lcm(x, y);
    }
}