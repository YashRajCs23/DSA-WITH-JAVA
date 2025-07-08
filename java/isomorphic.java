import java.util.Arrays;
public class isomorphic {
    public boolean isIsomorphic(String s, String t) {
        int[] arr = new int[256];
        Arrays.fill(arr,-1);
        boolean[] check = new boolean[256];
        Arrays.fill(check, false);       
        for (int i = 0; i < s.length(); i++) {
            if (arr[s.charAt(i)] == -1) {
                if (check[t.charAt(i)]) {
                    return false;
                }
                arr[s.charAt(i)] = t.charAt(i);
                check[t.charAt(i)] = true;
            } else if (arr[s.charAt(i)] != t.charAt(i)) {
                return false;
            }
        }
        return true;
    }
}