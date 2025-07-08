public class reverseVowelString{
    public boolean isVowel(char c){
        if(c=='a' || c=='e' || c=='i' || c=='o' || c=='u' || c=='A' ||c=='E' || c=='I' || c=='O' || c=='U') return true;
        return false;
    }
    public String reverseVowels(String s) {
        char[] ans=s.toCharArray();
        int n=ans.length;
        int i=0,j=n-1;
        while(i<j){
            while(i<j && !isVowel(ans[i]))i++;
            while(i<j && !isVowel(ans[j]))j--;
            if(i<j){
                char temp=ans[i];
                ans[i]=ans[j];
                ans[j]=temp;
                i++;
                j--;
            }
        }
        String result=new String(ans);
        return result;
    }
}