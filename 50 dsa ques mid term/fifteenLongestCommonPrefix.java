import java.util.Arrays;
public class fifteenLongestCommonPrefix {
    public String  longestCommonPrefix(String[] str){
        StringBuilder ans=new StringBuilder();
        Arrays.sort(str);
        char[] first=str[0].toCharArray();
        char[] last=str[str.length-1].toCharArray();
        for(int i=0;i<first.length;i++){
            if(first[i]!=last[i]) break;
            ans.append(first[i]);
        }
        return ans.toString();
    }
}