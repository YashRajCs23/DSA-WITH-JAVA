package dsa50;

import java.util.Scanner;

public class Ques49 {
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		String s=sc.nextLine();
		System.out.println(length(s));
	}
	static int length(String s) {
		s=s.trim();
		String[]str=s.split("\\s+");
		return str[str.length-1].length();
	}

}
