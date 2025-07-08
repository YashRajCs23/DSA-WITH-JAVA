package dsa_end_term;

public class CLIMBINGSTAIRS {
    public static int climb(int n){
        if(n==0||n==1)return n;
        return climb(n-1)+climb(n-2);
    }
}
