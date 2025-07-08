package dsa50;

import java.util.Scanner;

public class Ques13 {
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		int n=sc.nextInt();
		sc.nextLine();
		String [] words= new String[n];
		for(int i=0; i<n;i++) {
			words[i]=sc.nextLine();
		}
		int left=sc.nextInt();
		int right=sc.nextInt();
		System.out.println(check(words, left, right));
	}
	static int check(String[]str,int left,int right) {
		int count=0;
		for(int i=left; i<=right; i++) {
			if(str[i].isEmpty()) {
				continue;
			}
			char s=str[i].charAt(0);
			char e=str[i].charAt(str[i].length()-1);
			if(s=='a'||s=='e'||s=='i'||s=='o'||s=='u'){
                if(e=='a'||e=='e'||e=='i'||e=='o'||e=='u'){
                    count++;
                }
            }
		}
		return count;
	}

}
