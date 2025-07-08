import java.util.Arrays;
import java.util.Scanner;

public class Anagaram {
        public boolean isAnagram(String s, String t) {
            char[] sChars = s.toCharArray();
            char[] tChars = t.toCharArray();
            
            Arrays.sort(sChars);
            Arrays.sort(tChars);
            
            return Arrays.equals(sChars, tChars);
        }
    public static void main(String[] args) {
         Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String input = scanner.nextLine();
        System.out.println("You entered: " + input);
        scanner.close();
        
    }
}
