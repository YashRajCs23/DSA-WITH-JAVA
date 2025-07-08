
import java.util.Scanner;

public class fibbonacci {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        int n=sc.nextInt();
        int num1=0;
        int num2=1;
        for (int i=0;i<n;i++){
            int sum=num1+num2;
            System.out.println(num1);
            num1=num2;
            num2=sum;
        }
        int m=sc.nextInt();
        int m1=0,m2=1;
        for (int i = 0; i < n; i++) {
            int sum=m1+m2;
            System.out.println(m1);
            m1=m2;
            m2=sum;
        }
    }
}
