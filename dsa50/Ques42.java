package dsa50;

import java.util.Arrays;
import java.util.Scanner;

public class Ques42 {
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		int n=sc.nextInt();
		int []arr= new int[n];
		for(int i=0; i<n; i++) {
			arr[i]=sc.nextInt();
		}
		System.out.println(Arrays.toString(plusone(arr)));
	}
	static int[] plusone(int[]arr) {
		int n=arr.length;
		int[]num=new int[n+1];
		for(int i=n-1; i>=0; i--) {
			if(arr[i]<9) {
				arr[i]++;
				return arr;
			}
			arr[i]=0;
		}
		num[0]=1;
		return num;
	}

}
