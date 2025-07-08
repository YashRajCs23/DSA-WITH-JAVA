import java.util.*;
public class prime_num{
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.print("enter the number:");
        int n= sc.nextInt();
        int x=sc.nextInt();
        int count=0;
        while(count<n){
            boolean flag=true;
            for(int i=2;i*i<=x;i++){
                if(x%i==0){
                    flag=false;
                    break;
                }
            }
            if(flag==true){
                System.out.println(x);
                count++;
            }
            x++;
        }


        // Scanner sc= new Scanner(System.in);
        // System.out.println("enter first no");
        // int x=sc.nextInt();
        // System.out.println("enter second no");
        // int y=sc.nextInt();
        // for (int n =x; n<=y; n++) {
        //         boolean flag=true;
        //         for(int i=2;i*i<=n;i++){
        //         if(n%i==0){
        //             flag=false;
        //             break;
        //         }
        //     }
        //     if(flag==true){
        //         System.out.println(n);
        //     }      
        // }
    }
}
