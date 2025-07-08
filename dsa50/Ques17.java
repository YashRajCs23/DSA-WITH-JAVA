package dsa50;

import java.util.Scanner;

public class Ques17 {
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		int n=sc.nextInt();
		System.out.println(count(n));
	}
	static int count(int n) {
		if(n<=2) {
			return n;
		}
		int pre1=1;
		int pre2=2;
		for(int i=3; i<=n; i++) {
			int temp=pre1+pre2;
			pre1=pre2;
			pre2=temp;
		}
		return pre2;
	}

}
