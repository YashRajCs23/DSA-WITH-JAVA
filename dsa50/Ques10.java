package dsa50;

import java.util.Scanner;

public class Ques10 {
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		int n=sc.nextInt();
		int []arr= new int[n];
		for(int i=0; i<n; i++) {
			arr[i]=sc.nextInt();
		}
		divide(arr,0,n-1);
		for(int j=0; j<n; j++) {
			System.out.print(arr[j]+" ");
		}
	}
	static void divide(int[]arr,int st, int end) {
		if(st>=end)
		{
			return;
		}
		int mid=st+(end-st)/2;
		divide(arr,st,mid);
		divide(arr,mid+1,end);
		conqueror(arr,st,mid,end);
	}
	static void conqueror(int []arr, int st,int mid,int end) {
		int merge[]= new int[end-st+1];
		int i=st;
		int j=mid+1;
		int res=0;
		while(i<=mid && j<=end) {
			if(arr[i]<=arr[j]) {
				merge[res++]=arr[i++];
			}
			else {
				merge[res++]=arr[j++];
			}
		}
		while(i<=mid) {
			merge[res++]=arr[i++];
		}
		while(j<=end) {
			merge[res++]=arr[j++];
		}
		for(int idx=0; idx<merge.length; idx++) {
			arr[st+idx]=merge[idx];
		}
	}

}
