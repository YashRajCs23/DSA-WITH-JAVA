package dsa50;

import java.util.*;

public class Ques40 {
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		int m=sc.nextInt();
		int n=sc.nextInt();
		int[]arr1=new int[m+n];
		int[]arr2=new int[n];
		for(int i=0; i<arr1.length; i++) {
			arr1[i]=sc.nextInt();
		}
		for(int i=0; i<arr2.length; i++) {
			arr2[i]=sc.nextInt();
		}
		merge(arr1, m, arr2, n);
		System.out.println(Arrays.toString(arr1));
	}
	static void merge(int[]arr1,int m,int[]arr2,int n) {
		int p1=m-1;
		int p2=n-1;
		int p=arr1.length-1;
		while(p1>=0&&p2>=0) {
			if(arr1[p1]>arr2[p2]) {
				arr1[p--]=arr1[p1--];
			}
			else {
				arr1[p--]=arr2[p2--];
			}
		}
		while(p2>=0) {
			arr1[p--]=arr2[p2--];
		}
	}

}
