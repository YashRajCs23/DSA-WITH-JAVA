package dsa50;

import java.util.Scanner;

public class Ques44 {
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		String s1=sc.nextLine();
		String s2=sc.nextLine();
		System.out.println(add(s1, s2));
	}
	static String add(String s1, String s2) {
		int n=s1.length()-1;
		int m=s2.length()-1;
		int c=0;
		StringBuilder ans= new StringBuilder();
		while(n>=0||m>=0||c!=0) {
			int p=0,p1=0,p2=0;
			if(n>=0) {
				p1=s1.charAt(n--)-'0';
			}
			if(m>=0) {
				p2=s2.charAt(m--)-'0';
			}
			p=p1+p2+c;
			ans.append(p%10);
			c=p/10;
		}
		return ans.reverse().toString();
	}

}
