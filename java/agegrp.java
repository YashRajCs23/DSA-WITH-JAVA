import java.util.Scanner;

public class agegrp {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        int n=sc.nextInt();
        if(n<=5){
            System.out.println("child");
        }else if(n>5 && n<=18){
            System.out.println("teenage");
        }else{
            System.out.println("adult");
        }
    }
}
