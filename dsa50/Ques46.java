package dsa50;

import java.util.HashSet;
import java.util.Scanner;

public class Ques46 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n=sc.nextInt();
		System.out.println(happy(n));
	}
	static boolean happy(int n) {
		HashSet<Integer> seen= new HashSet<Integer>();
		while(n!=1 && !seen.contains(n)) {
			seen.add(n);
			n=square(n);
		}
		return n==1;
	}
	static int square(int n) {
		int sum=0;
		while(n>0) {
			int rem=n%10;
			sum+=rem*rem;
			n/=10;
		}
		return sum;
	}

}
