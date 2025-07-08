package dsa50;

import java.util.HashMap;
import java.util.Scanner;

public class Ques37 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s=sc.nextLine();
		String t=sc.nextLine();
		System.out.println(isIso(s, t));
	}
	static boolean isIso(String s, String t) {
		if(s.length()!=t.length()) {
			return false;
		}
		HashMap<Character, Character> map1= new HashMap<Character, Character>();
		HashMap<Character, Boolean> map2= new HashMap<Character, Boolean>();
		for(int i=0; i<s.length(); i++) {
			char c1=s.charAt(i);
			char c2=t.charAt(i);
			if(map1.containsKey(c1)) {
				if(map1.get(c1)!=c2) {
					return false;
				}
			}
			else {
				if(map2.containsKey(c2)) {
					return false;
				}
				else {
					map1.put(c1, c2);
					map2.put(c2, true);
				}
			}
		}
		return true;
	}

}
