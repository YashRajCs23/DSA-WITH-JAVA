// package oops;
import java.util.*;
public class ques3 {
    public static boolean isPalindrome(String s){
        int i=0,j=s.length()-1;
        while(i<j){
            if (s.charAt(i) != s.charAt(j)) {
                return false;
            }
            i++;
            j--;
        }
        return true;
    }
    public static void print(String str){
        for(int i=0;i<str.length();i++){
            int count=0;
        char ch =str.charAt(i);
        if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u'||
        ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U'){
        System.out.print(i+" ");
        count++;
        }
        System.out.println(count);
        }
    }

    public static void countWords(String s){
        StringTokenizer str=new StringTokenizer(s);
        System.out.println(str.countTokens());
    }
    public static String removeDuplicates(String s) {
        StringBuilder result = new StringBuilder(); 
        
        for (int i = 0; i < s.length(); i++) {
            if (result.length() == 0 || result.charAt(result.length() - 1) != s.charAt(i)) {
                result.append(s.charAt(i)); 
            }
        }
        
        return result.toString();
    }

public static String capitalizeFirstLetter(String s) {
    if (s == null || s.isEmpty()) {
        return s;  // Return the string as is if it's null or empty
    }
    
    // Capitalize the first character and append the rest of the string
    return s.substring(0, 1).toUpperCase() + s.substring(1);
}

public static int reverseInteger(int n) {
    int reversed = 0;   
    while (n != 0) {
        int digit = n % 10;
        reversed = reversed * 10 + digit;
        n /= 10;
    }  
    return reversed;
}
public static char firstNonRepeatingCharacter(String s) {
    HashMap<Character, Integer> freqMap = new HashMap<>();
    for (int i = 0; i < s.length(); i++) {
        char ch = s.charAt(i);
        freqMap.put(ch, freqMap.getOrDefault(ch, 0) + 1);
    }
    for (int i = 0; i < s.length(); i++) {
        char ch = s.charAt(i);
        if (freqMap.get(ch) == 1) {
            return ch;
        }
    }
    return ' ';
}

public static String distinctString (String a){
    Set<Character> distinct=new LinkedHashSet<>();
    for (int i = 0; i < a.length(); i++) {
        distinct.add(a.charAt(i));
    }
    StringBuilder result = new StringBuilder();
    for (Character ch : distinct) {
        result.append(ch);
    }   
    return result.toString();
}

    public static void main(String[] args) {
        // Scanner sc= new Scanner(System.in);
        // String s1=sc.nextLine();
        // // String s2=sc.nextLine();
        // // System.out.println(s1.equals(s2));
        // for (int i = 0; i < s1.length(); i++) {
        //     System.out.println(s1.charAt(i));
        // }
        // System.out.println(isPalindrome(s1));
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int m=sc.nextInt();
        ArrayList<Integer> m1=new ArrayList<>();
        ArrayList<Integer> m2=new ArrayList<>();
        for (int i = 0; i < n; i++) {
            int element=sc.nextInt();
            m1.add(element);
        }
        for (int i = 0; i < m; i++) {
            int element=sc.nextInt();
            m2.add(element);
        }
        m1.addAll(m2);
        System.out.println(m1);

    }
}
