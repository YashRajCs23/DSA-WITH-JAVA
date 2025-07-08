package dsa50;

import java.util.Scanner;

public class Ques19 {
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		int n=sc.nextInt();
		int []arr= new int[n];
		for(int i=0; i<n; i++) {
			arr[i]=sc.nextInt();
		}
		System.out.println(profit(arr));
	}
	static int profit(int[]arr) {
		int min=Integer.MAX_VALUE;
		int pro=0;
		for(int i=0; i<arr.length; i++) {
			if(arr[i]<min) {
				min=arr[i];
			}
			else if(arr[i]-min>pro) {
				pro=arr[i]-min;
			}
		}
		return pro;
	}

}
