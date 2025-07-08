import java.util.Scanner;

public class while_loop {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        int n=sc.nextInt();
        int num=1;
        int sum=0;
        // while(num<=n){
        //     // System.out.println(num);
        //     sum=sum+num; //printing sum of n no
        //     num++;
        // }
        // System.out.println(sum);

        //printing sum of random no given by user
        // while(n!=-1){
        //     sum+=n;
        //     n=sc.nextInt();
        // }
        // System.out.println(sum);

        //multiple of 5 and div by both
        while (true) {
            if ((num%5==0)&& (num%7==0)) {
                System.out.println("found ans"+sum);
                break;
            }
            num++;
        }
    }
}
