package dsa50;

import java.util.Scanner;

public class Ques6 {
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		int n=sc.nextInt();
		int []arr= new int[n];
		for(int i=0; i<n; i++) {
			arr[i]=sc.nextInt();
		}
		System.out.println(check(arr));
	}
	static boolean check(int[]arr) {
		int n=arr.length;
		for(int i=1; i<n; i++) {
			if(arr[i]<arr[i-1]) {
				return false;
			}
		}
		return true;
	}

}
