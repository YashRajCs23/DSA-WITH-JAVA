import java.util.Scanner;
public class check_prime {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        int n = sc.nextInt();
        int x= sc.nextInt();
        int y= sc.nextInt();
        // for(int i = x ; i<=y;i++){
        //     if(check_prime(i)){
        //         System.out.println(i);
        //     }
        check_prime(10);
        }
    public static boolean check_prime(int n){
        for ( int i=2; i*i <=n ; i++){
            if (n%i==0){
                return False;
            }

        }
        return True;
    }

    }

 

      
