package dsa50;

import java.util.Scanner;

public class Ques31 {
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		int n=sc.nextInt();
		System.out.println(isArmstrong(n));
	}
	static boolean isArmstrong(int n) {
		int temp=n;
		int ans=0;
		while(temp>0) {
			int rem=temp%10;
			ans+=rem*rem*rem;
			temp/=10;
		}
		return ans==n;
	}

}
