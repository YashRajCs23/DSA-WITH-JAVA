package dsa50;

import java.util.HashMap;
import java.util.Scanner;

public class Ques26 {
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		String s=sc.nextLine();
		System.out.println(uni(s));
	}
	static int uni(String s) {
		HashMap<Character,Integer> map= new HashMap<>();
		for(int i=0; i<s.length(); i++) {
			map.put(s.charAt(i), map.getOrDefault(s.charAt(i), 0)+1);
		}
		for(int i=0; i<map.size();i++) {
			if(map.get(s.charAt(i))==1) {
				return i;
			}
		}
		return -1;
	}

}
