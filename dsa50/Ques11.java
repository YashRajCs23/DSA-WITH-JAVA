package dsa50;

import java.util.Scanner;

public class Ques11 {
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		String s=sc.nextLine();
		System.out.println(check(s));
	}
	static boolean check(String s) {
		s=s.toLowerCase();
		int low=0;
		int high=s.length()-1;
		while(low<=high) {
			while(low<high&&!Character.isLetterOrDigit(s.charAt(low))) {
				low++;
			}
			while(low<high&&!Character.isLetterOrDigit(s.charAt(high))) {
				high--;
			}
			if(s.charAt(low)!=s.charAt(high)) {
				return false;
			}
			low++;
			high--;
		}
		return true;
	}

}
