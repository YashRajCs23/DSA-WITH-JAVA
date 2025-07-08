package dsa50;

import java.util.Scanner;

public class Ques14 {
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		String s=sc.nextLine();
		String t=sc.nextLine();
		System.out.println(anagram(s, t));
	}
	static boolean anagram(String s, String t) {
		int m=s.length();
		int n=t.length();
		if(m!=n) {
			return false;
		}
		char[]arr=new char[26];
		for(int i=0; i<m; i++) {
			arr[s.charAt(i)-'a']++;
		}
		for(int i=0; i<n; i++) {
			arr[t.charAt(i)-'a']--;
		}
		for(int i=0; i<arr.length; i++) {
			if(arr[i]!=0) {
				return false;
			}
		}
		return true;
	}

}
