package dsa50;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Ques21 {
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		int n=sc.nextInt();
		int []arr= new int[n];
		for(int i=0; i<n; i++) {
			arr[i]=sc.nextInt();
		}
		List<List<Integer>> res= sum(arr);
		System.out.print('[');
		for(int i=0; i<res.size(); i++) {
			System.out.print(res.get(i));
			if(i<res.size()-1) {
				System.out.print(',');
			}
		}
		System.out.print(']');
		
	}
	
	static List<List<Integer>> sum(int[]arr){
		List<List<Integer>> ans = new ArrayList<>();
		Arrays.sort(arr);
		for(int i=0; i<arr.length-2; i++) {
			if(i>0&&arr[i]==arr[i-1]) {
				continue;
			}
			int j=i+1;
			int k=arr.length-1;
			while(j<k) {
				if(arr[i]+arr[j]+arr[k]>0) {
					k--;
				}
				else if(arr[i]+arr[j]+arr[k]<0) {
					j++;
				}
				else {
					ans.add(Arrays.asList(arr[i],arr[j],arr[k]));
					while(j<k&&arr[j]==arr[j+1]) {
						j++;
					}
					while(j<k&&arr[k]==arr[k-1]) {
						k--;
					}
					j++;
					k--;
				}
			}
			
		}
		return ans;
		
	}
	

}
