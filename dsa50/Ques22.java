package dsa50;

import java.util.Scanner;

public class Ques22 {
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		int n=sc.nextInt();
		int []arr= new int[n];
		for(int i=0; i<n; i++) {
			arr[i]=sc.nextInt();
		}
		arrnge(arr);
		for(int i=0; i<n; i++) {
			System.out.print(arr[i]+" ");
		}
	}
	static void arrnge(int[]arr) {
		int idx=1;
		for(int i=1; i<arr.length; i++) {
			if(arr[i]!=arr[i-1]) {
				arr[idx++]=arr[i];
			}
		}
	}

}
