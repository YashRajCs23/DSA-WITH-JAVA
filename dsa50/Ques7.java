package dsa50;

import java.util.Scanner;

public class Ques7 {
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		int n=sc.nextInt();
		int []arr= new int[n];
		for(int i=0; i<n; i++) {
			arr[i]=sc.nextInt();
		}
		System.out.println(check(arr));
	}
	static int check(int[]arr) {
		int n=arr.length;
		int seclarge=-1;
		int largest=arr[0];
		for(int i=1; i<n; i++) {
			if(largest<arr[i]) {
				seclarge=largest;
				largest=arr[i];
			}
			else if(arr[i]<largest&&seclarge<arr[i]) {
				seclarge=arr[i];
			}
		}
		return seclarge;
	}

}
