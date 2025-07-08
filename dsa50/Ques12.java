package dsa50;

import java.util.Scanner;

public class Ques12 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s=sc.nextLine();
		System.out.println(reverse(s));
	}
	static String reverse(String s){
		s=s.trim();
		StringBuilder sb= new StringBuilder();
		String[] str= s.split("\\s+");
		for(int i=str.length-1; i>=0; i--) {
			sb.append(str[i]);
			sb.append(" ");
		}
		return sb.toString().trim();
	}

}
