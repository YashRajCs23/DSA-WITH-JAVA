import java.util.Scanner;

public class for_loop_basics {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        int n=sc.nextInt();
        //print n no
        for (int num=1; num<=n;num++){
            System.out.println(num);
        }

        //sum of n natural no
        int sum=0;
        for (int num=1; num<=n;num++){
            sum=sum+num;
        }
        System.out.println(sum);


        //revere order n no
        for (int num=n; num>=1;num--){
            System.out.println(num);
        }

        //iterating lesser than 2 times
        for (int num=n; num>=1;num-=2){
            System.out.println(num);
        }


        //multiple of 5 and div by both
        int num=sc.nextInt();
        for(num=1;num>=n;num++) {
            if ((num%5==0)&& (num%7==0)) {
                System.out.println("found ans"+sum);
                break;
            }
            num++;
        }


        //printingall values bw 1-50 excpet mul of 3
        my_loop: for(num=1;num<=50;num++){ //assigning name to a loop
            if(num%3==0){
                continue my_loop;
            }
            System.out.println(num);
        }
    }
}
