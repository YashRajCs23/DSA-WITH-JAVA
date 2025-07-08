public class q31ArmstrongNu {
    public static boolean armstrong(int n){
        int temp=n;
        int r;
        int sum=0;
        while(n>0){
            r=n%10;
            n=n/10;
            sum=r*r*r+sum;
        }
        if(temp==sum){
            return true;
        }
        return false;
    }
}