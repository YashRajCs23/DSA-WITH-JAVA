package dsa50;

import java.util.Arrays;
import java.util.Scanner;

public class Ques9 {
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		int n=sc.nextInt();
		int t=sc.nextInt();
		int []arr= new int[n];
		for(int i=0; i<n; i++) {
			arr[i]=sc.nextInt();
		}
		System.out.println(Arrays.toString( new int[]{lowerbound(arr,t),upperbound(arr,t)}));
	}
	static int lowerbound(int[]arr,int target) {
		int idx=-1;
		int low=0;
		int high=arr.length-1;
		while(low<=high) {
			int mid=low+(high-low)/2;
			if(arr[mid]>=target) {
				high=mid-1;
			}
			else {
				low=mid+1;
			}
			if(arr[mid]==target) {
				idx=mid;
			}
		}
		return idx;
	}
	static int upperbound(int[]arr,int target) {
		int idx=-1;
		int low=0;
		int high=arr.length-1;
		while(low<=high) {
			int mid=low+(high-low)/2;
			if(arr[mid]<=target) {
				low=mid+1;
			}
			else {
				high=mid-1;
			}
			if(arr[mid]==target) {
				idx=mid;
			}
		}
		return idx;
	}
}
