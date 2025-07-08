package dsa50;

import java.util.Scanner;

public class Ques47 {
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		int n=sc.nextInt();
		int []arr= new int[n];
		for(int i=0; i<n; i++) {
			arr[i]=sc.nextInt();
		}
		int t=sc.nextInt();
		System.out.println(search(arr, t));
	}
	static int search(int[]arr,int target) {
		int low=0;
		int high=arr.length-1;
		while(low<=high) {
			int mid=low+(high-low)/2;
			if(arr[mid]==target) {
				return mid;
			}
			else if(arr[mid]<target) {
				low=mid+1;
			}
			else {
				high=mid-1;
			}
		}
		return low;
	}

}
