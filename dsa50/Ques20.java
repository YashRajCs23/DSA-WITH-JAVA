package dsa50;

import java.util.Arrays;
import java.util.Scanner;

public class Ques20 {
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		int n=sc.nextInt();
		int []arr= new int[n];
		for(int i=0; i<n; i++) {
			arr[i]=sc.nextInt();
		}
		move(arr);
		System.out.println(Arrays.toString(arr));
	}
	static void move(int[]arr) {
		int idx=0;
		for(int i=0; i<arr.length; i++) {
			if(arr[i]!=0) {
				arr[idx++]=arr[i];
			}
		}
		for(int i=idx;i<arr.length; i++) {
			arr[i]=0;
		}
	}

}
