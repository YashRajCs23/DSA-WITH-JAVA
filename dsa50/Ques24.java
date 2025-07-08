package dsa50;

import java.util.Arrays;
import java.util.Scanner;

public class Ques24 {
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		int n=sc.nextInt();
		char []arr= new char[n];
		for(int i=0; i<n; i++) {
			arr[i]=sc.next().charAt(0);
		}
		reverse(arr);
		System.out.println(Arrays.toString(arr));
	}
	static void reverse(char[]ch) {
		int i=0;
		int j=ch.length-1;
		while(i<j) {
			char temp=ch[i];
			ch[i]=ch[j];
			ch[j]=temp;
			i++;
			j--;
		}
	}

}
