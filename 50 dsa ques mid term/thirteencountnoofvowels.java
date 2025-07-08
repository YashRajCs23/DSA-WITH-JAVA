public class thirteencountnoofvowels {
    public int vowelStrings(String[] words,int left, int right){
        int count=0;
        for(int i=left;i<=right;i++){
            if(checkVowel(words[i])) count++;
        }
        return count;
    }
    static boolean checkVowel(String str){
        if(str.length()==0) return false;
        char firstChar=Character.toLowerCase(str.charAt(0));
        char lastChar=Character.toLowerCase(str.charAt(str.length()-1));
        if((firstChar=='a' || firstChar=='e' || firstChar=='i' || firstChar=='o' || firstChar=='u') && (lastChar=='a' || lastChar=='e' || lastChar=='i' || lastChar=='o' || lastChar=='u'))
        return true;
        return false;
    }
}