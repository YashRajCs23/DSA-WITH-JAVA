package dsa50;

import java.util.*;

public class Ques4 {
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		int n=sc.nextInt();
		System.out.println(reverse(n));
	}
	static int reverse(int num) {
		int res=0;
		int sign=(num<0)?-1:1;
		num=Math.abs(num);
		while(num>0)
		{
			int rem=num%10;
			if(res>Integer.MAX_VALUE/10||(res==Integer.MAX_VALUE/10&&rem>7)) {
				return 0;
			}
			res=res*10+rem;
			num/=10;
		}
		return sign*res;
	}

}
