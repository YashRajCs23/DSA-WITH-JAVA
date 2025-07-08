package dsa50;
import java.util.*;
public class Ques39 {
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		int n=sc.nextInt();
		System.out.println(generate(n));
	}
	static List<String> generate(int n){
		List<String> ans= new ArrayList<String>();
		back(ans, "", 0, 0, n);
		return ans;
	}
	static void back(List<String> ans, String cur, int open, int close, int n) {
		if(cur.length()==2*n) {
			ans.add(cur);
			return;
		}
		if(open<n) {
			back(ans, cur+"(", open+1, close, n);
		}
		if(close<open) {
			back(ans,cur+")",open,close+1, n);
		}
	}
}