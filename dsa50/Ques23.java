package dsa50;

import java.util.Scanner;

public class Ques23 {
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		int n=sc.nextInt();
		int []arr= new int[n];
		for(int i=0; i<n; i++) {
			arr[i]=sc.nextInt();
		}
		System.out.println(water(arr));
	}
	static int water(int []arr) {
		int max=0;
		int i=0;
		int j=arr.length-1;
		while(i<j) {
			int w=j-i;
			int h=Math.min(arr[i], arr[j]);
			int contain=w*h;
			max=Math.max(max, contain);
			if(arr[i]>arr[j]) {
				j--;
			}
			else
			{
				i++;
			}
		}
		return max;
	}

}
