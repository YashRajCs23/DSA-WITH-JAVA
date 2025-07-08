import java.util.Scanner;
public class fourreversenumber {
    public static int reverse(int x){
        int reversed=0;
        while(x!=0){
            int temp=x%10;
            x=x/10;
            if (reversed>Integer.MAX_VALUE/10 || (reversed==Integer.MAX_VALUE/10 && temp>7)){
                return 0; // Overflow for positive numbers
            }
            if (reversed<Integer.MIN_VALUE/10 || (reversed==Integer.MIN_VALUE/10 && temp<-8)){
                return 0; // Underflow for negative numbers
            }
            reversed=reversed*10+temp;
        }
        return reversed;   
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int x=sc.nextInt();
        System.out.println(reverse(x));
    }
}