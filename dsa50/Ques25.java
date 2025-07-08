package dsa50;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Ques25 {
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		String s=sc.nextLine();
		System.out.println(reverse(s));
	}
	static String reverse(String s) {
		Set<Character> set= new HashSet<Character>(Arrays.asList('a','e','i','o','u','A','E','I','O','U'));
		int i=0;
		int j=s.length()-1;
		char ch[]=s.toCharArray();
		while(i<j) {
			while(i<j&&!set.contains(ch[i])) {
				i++;
			}
			while(i<j&&!set.contains(ch[j])) {
				j--;
			}
			char temp=ch[i];
			ch[i]=ch[j];
			ch[j]=temp;
			i++;
			j--;
		}
		return new String(ch);
	}

}
