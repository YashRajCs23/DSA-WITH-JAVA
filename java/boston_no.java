import java.util.Scanner;
public class boston_no {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int dsum=sum_of_digits(n);
        int fsum=0;
        for(int i=2;i<=n;i++){
            while(n%i==0){
                fsum=sum+sum_of_digits(i);
                n=n/10;
            }
        }    
        if(fsum==dsum){
            System.out.println(1);
        }else{
            System.out.println(0);
        }
        public static int sum_of_digits(int n){
            int s=0;
            while(n>0){
                int d=n%10;
                s=s+d;
                n=n/10;
            }
            return s;
        }
    }
    }
