public class q16counthomosubstring {
    static int MOD=1000000007;
    public static int substring(String s){
        int n=s.length();
        int res=0;
        int length=0;
        for(int i=0;i<n;i++){
            if(i>0 && s.charAt(i)==s.charAt(i-1)){
                length+=1;
            }
            else length=1;
        }
        res=(res+length)%MOD;
        return res; 
    }
}