package dsa50;

import java.util.Scanner;

public class Ques16 {
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		String s=sc.nextLine();
		System.out.println(count(s));
	}
	static int count(String s) {
		int res=0;
		int count=1;
		int mod=1000000007;
		int n=s.length();
		for(int i=0; i<n; i++) {
			if(i>0&&s.charAt(i)==s.charAt(i-1)) {
				count++;
			}
			else {
				count=1;
			}
			res=(res+count)%mod;
		}
		return res;
	}

}
