import java.util.Scanner;
public class generateParanthesis {
    public static void sol(int n,int ob,int cb,String ans){
        if(ob>n/2)return;
        if(ob+cb==n){
            System.out.println(ans);
            return;
        }
        if(cb>ob)return;
        sol(n,ob+1,cb,ans+"(");
        sol(n, ob, cb+1, ans+")");
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        sol(n*2,0,0,"");
    }
}