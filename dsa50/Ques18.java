package dsa50;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Ques18 {
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		int n=sc.nextInt();
		List<List<Integer>> res= generate(n);
		System.out.print('[');
		for(int i=0; i<res.size(); i++) {
			System.out.print(res.get(i));
			if(i<res.size()-1) {
				System.out.print(',');
			}
		}
		System.out.print(']');
	}
	static List<List<Integer>> generate(int num){
		List<List<Integer>> ans= new ArrayList<>();
		for(int i=1; i<=num; i++) {
			ans.add(add(i));
		}
		return ans;
	}
	static List<Integer> add(int num){
		List<Integer> ans= new ArrayList<Integer>();
		int var=1;
		ans.add(1);
		for(int i=1; i<num; i++) {
			var=var*(num-i);
			var/=i;
			ans.add(var);
		}
		return ans;
	}

}
