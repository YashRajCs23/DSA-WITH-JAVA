package dsa50;

import java.util.Arrays;
import java.util.Scanner;

public class Ques15 {
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		int n=sc.nextInt();
		sc.nextLine();
		String[]str=new String[n];
		for(int i=0; i<n; i++) {
			str[i]=sc.nextLine();
		}
		System.out.println(find(str));
	}
	static String find(String[]str) {
		StringBuilder sb= new StringBuilder();
		Arrays.sort(str);
		char[]arr1=str[0].toCharArray();
		char[]arr2=str[str.length-1].toCharArray();
		for(int i=0; i<arr1.length; i++) {
			if(arr1[i]!=arr2[i]) {
				break;
			}
			sb.append(arr1[i]);
		}
		return sb.toString();
	}

}
