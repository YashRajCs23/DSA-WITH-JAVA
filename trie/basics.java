public class basics {
    static class Node {
        Node[] children;
        boolean eow;

        public Node() {
            children = new Node[26]; // a to z
            eow = false;
        }
    }

    static Node root = new Node();

    // Insert a word into the Trie
    public static void insert(String word) {
        Node curr = root;
        for (int i = 0; i < word.length(); i++) {
            int idx = word.charAt(i) - 'a';
            if (curr.children[idx] == null) {
                curr.children[idx] = new Node();
            }
            if (i == word.length() - 1) {
                curr.children[idx].eow = true;
            }
            curr = curr.children[idx];
        }
    }

    // Search for a word in the Trie
    public static boolean search(String key) {
        Node curr = root;
        for (int i = 0; i < key.length(); i++) {
            int idx = key.charAt(i) - 'a';
            Node node = curr.children[idx];
            if (node == null) return false;
            if (i == key.length() - 1 && !node.eow) return false;
            curr = curr.children[idx];
        }
        return true;
    }

    // Word Break Problem
    public static boolean wordBreak(String key) {
        if (key.length() == 0) return true;
        for (int i = 1; i <= key.length(); i++) {
            String firstPart = key.substring(0, i);
            String secPart = key.substring(i);
            if (search(firstPart) && wordBreak(secPart)) return true;
        }
        return false;
    }

    // Check if prefix exists in Trie
    public static boolean startsWith(String prefix) {
        Node curr = root;
        for (int i = 0; i < prefix.length(); i++) {
            int idx = prefix.charAt(i) - 'a';
            if (curr.children[idx] == null) return false;
            curr = curr.children[idx];
        }
        return true;
    }

    // Count all nodes in the Trie
    public static int countNode(Node root) {
        if (root == null) return 0;
        int count = 0;
        for (int i = 0; i < 26; i++) {
            if (root.children[i] != null) {
                count += countNode(root.children[i]);
            }
        }
        return count + 1;
    }

    public static String ans = "";

    // Find longest word with all prefixes present
    public static void longestWord(Node root, StringBuilder temp) {
        if (root == null) return;
        for (int i = 0; i < 26; i++) {
            if (root.children[i] != null && root.children[i].eow) {
                temp.append((char) (i + 'a'));
                if (temp.length() > ans.length()) {
                    ans = temp.toString();
                }
                longestWord(root.children[i], temp);
                temp.deleteCharAt(temp.length() - 1);
            }
        }
    }

    public static void main(String args[]) {
        String words[] = {"the", "a", "there", "their", "any"};
        String key = "ilikesamsung";
        String prefix = "app";

        for (String word : words) {
            insert(word);
        }

        System.out.println(search("their"));  // true
        System.out.println(search("thor"));   // false
        System.out.println(search("an"));     // false
        System.out.println(wordBreak(key));   // false
        System.out.println(startsWith(prefix)); // false
        System.out.println(countNode(root));  // total number of nodes
        longestWord(root, new StringBuilder(""));
        System.out.println(ans);              // longest valid word
    }
}