package dsa50;

import java.util.Scanner;

public class Ques5 {
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		int n=sc.nextInt();
		int []arr= new int[n];
		for(int i=0; i<n; i++) {
			arr[i]=sc.nextInt();
		}
		System.out.println(majority(arr));
	}
	static int majority(int[]arr) {
		int cnt=0;
		int el=0;
		for(int i=0; i<arr.length; i++) {
			if(cnt==0) {
				cnt=1;
				el=arr[i];
			}
			else if(el==arr[i]) {
				cnt++;
			}
			else {
				cnt--;
			}
		}
		return el;
	}

}
