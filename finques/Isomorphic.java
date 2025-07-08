import java.util.HashMap;

public class Isomorphic {

    public boolean isIsomorphic(String s, String t) {
        if (s.length() != t.length()) return false;

        HashMap<Character, Character> map = new HashMap<>();

        for (int i = 0; i < s.length(); i++) {
            char sCh = s.charAt(i);
            char tCh = t.charAt(i);

            if (map.containsKey(sCh)) {
                if (map.get(sCh) != tCh) return false;
            } else {
                if (map.containsValue(tCh)) return false;
                map.put(sCh, tCh);
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Isomorphic checker = new Isomorphic();
        String s1 = "egg";
        String t1 = "add";
        String s2 = "foo";
        String t2 = "bar";

        System.out.println("Are '" + s1 + "' and '" + t1 + "' isomorphic? " + checker.isIsomorphic(s1, t1));
        System.out.println("Are '" + s2 + "' and '" + t2 + "' isomorphic? " + checker.isIsomorphic(s2, t2));
    }
}
