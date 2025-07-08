package dsa50;

import java.util.Scanner;

public class Ques43 {
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		int n=sc.nextInt();
		int []arr= new int[n];
		for(int i=0; i<n; i++) {
			arr[i]=sc.nextInt();
		}
		System.out.println(find(arr));
	}
	static int find(int[]arr){
		int n=arr.length;
		int exp=n*(n+1)/2;
		int act=0;
		for(int i=0; i<n; i++)
		{
			act+=arr[i];
		}
		return exp-act;
	}
//	static int max(int []arr) {
//		int max=Integer.MIN_VALUE;
//		for(int i=0; i<arr.length; i++) {
//			if(arr[i]>max) {
//				max=arr[i];
//			}
//		}
//		return max;
//	}

}
