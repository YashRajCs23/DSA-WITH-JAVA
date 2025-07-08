package dsa50;

import java.util.Scanner;

public class Ques45 {
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		int n=sc.nextInt();
		int []arr= new int[n];
		for(int i=0; i<n; i++) {
			arr[i]=sc.nextInt();
		}
		System.out.println(pro(arr));
	}
	static int pro(int[]arr) {
		int ans1=1;
		int ans2=1;
		int max=0;
		int n=arr.length-1;
		ans1=arr[n]*arr[n-1]*arr[n-2];
		ans2=arr[0]*arr[1]*arr[n];
		return max=Math.max(ans1, ans2);
	}

}
