package dsa50;
import java.util.*;
public class Ques41 {
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		String s= sc.nextLine();
		System.out.println(toInt(s));
	}
	static int toInt(String s) {
		HashMap<Character, Integer> m= new HashMap<>();
		 	m.put('I', 1);
	        m.put('V', 5);
	        m.put('X', 10);
	        m.put('L', 50);
	        m.put('C', 100);
	        m.put('D', 500);
	        m.put('M', 1000);
	        int ans=0;
	        for(int i=0; i<s.length(); i++) {
	        	if(i<s.length()-1&&m.get(s.charAt(i))<m.get(s.charAt(i+1))) {
	        		ans-=m.get(s.charAt(i));
	        	}
	        	else {
	        		ans+=m.get(s.charAt(i));
	        	}
	        }
	        return ans;
	        
	}

}
