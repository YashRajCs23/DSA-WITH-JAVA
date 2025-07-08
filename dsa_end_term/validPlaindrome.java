package dsa_end_term;
public class validPlaindrome {
    public boolean isPalindrome(String s) {
        s=s.toLowerCase();
        int n=s.length();
        StringBuilder sb=new StringBuilder();
        for(int i=0;i<n;i++){
            char c=s.charAt(i);
            if((c>='a'&&c<='z')||(c>='0'&&c<='9'))sb.append(c);
        }
        int m=sb.length();
        for(int i=0;i<m/2;i++){
            if(sb.charAt(i)!=sb.charAt(m-1-i))return false;
        }
        return true;
    }
}