import java.util.Scanner;
public class sum {
    public static int addAlternative(int n){
        if(n==0) return 0;
        if(n%2==0){
            return addAlternative(n-1)-n;
        }
        else{
            return addAlternative(n-1)+n;
        }
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        addAlternative(n);
    }
}