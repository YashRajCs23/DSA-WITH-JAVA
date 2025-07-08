package dsa50;

import java.util.Scanner;

public class Ques50 {
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		int n=sc.nextInt();
		int []arr= new int[n];
		for(int i=0; i<n; i++) {
			arr[i]=sc.nextInt();
		}
		System.out.println(count(arr));
	}
	static int count(int[]arr) {
		int n=0;
		for(int i=0; i<arr.length; i++) {
			int c=(int) (Math.log(arr[i])+1);
			if(c%2==0) {
				n++;
			}
		}
		return n;
	}
}
