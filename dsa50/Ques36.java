package dsa50;

import java.util.Scanner;

public class Ques36 {
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		String n=sc.nextLine();
		String t=sc.nextLine();
		System.out.println(press(n, t));
	}
	static boolean press(String name, String typed) {
		int i=0;
		int j=0;
		while(j<typed.length()) {
			if(i<name.length()&&name.charAt(i)==typed.charAt(j)) {
				i++;
				j++;
			}
			else if(j>0&&typed.charAt(i)==typed.charAt(j)) {
				j++;
			}
			else {
				return false;
			}
		}
		return true;
	}

}
