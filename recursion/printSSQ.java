public class printSSQ {
    public static void printssq(String s,String currAns){
        if(s.length()==0){
            System.out.println(currAns);
            return;
        }
        char curr=s.charAt(0);
        String remString=s.substring(1);
        printssq(remString, currAns+curr);
        printssq(remString, currAns);
    }
    public static void main(String[] args) {
        printssq("abc","");
    }
}
