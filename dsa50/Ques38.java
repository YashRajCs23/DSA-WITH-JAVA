package dsa50;

import java.util.Scanner;

public class Ques38 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s=sc.nextLine();
		String t=sc.nextLine();
		System.out.println(isSub(s, t));
	}
	static boolean isSub(String s, String t) {
		int i=0;
		int j=0;
		while(i<s.length()&&j<t.length()) {
			if(s.charAt(i)==t.charAt(j)) {
				i++;
				j++;
			}
			else {
				j++;
			}
		}
		return i==s.length();
	}

}
