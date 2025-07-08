import java.util.*;

public class chech_fibonacci_no {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        int n=sc.nextInt();
        if(n==0 || n==1) {
            System.out.println("yes");
        }else{
            int a=0;
            int b=1;
            int c=1;
            while (true){
                c=a+b;
                a=b;
                b=c;
                if(c==n){
                    System.out.println("yes");
                    break;
                }
                else if(c>n){
                    System.out.println("no");
                    break;
                }
            }

}
    }
}

