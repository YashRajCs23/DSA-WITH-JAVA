import java.util.Scanner;
public class count_noofdidgit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        int digits=0;
        while(n>0){
            n=n/10;
            digits++;
        }
        System.out.println(digits);
    }
}
