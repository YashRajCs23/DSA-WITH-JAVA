public class twelvereversewords {
    public String reverse(String s){
        String[] words = s.trim().split("\\s+");
        StringBuilder ans = new StringBuilder();
        for (int i = words.length - 1; i >= 0; i--) {
            ans.append(words[i]).append(" ");
        }
        return ans.toString().trim();
    }
}