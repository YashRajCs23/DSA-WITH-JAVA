//package dsa_end_term;
import java.util.ArrayList;
import java.util.List;
public class pascal {
    public List<List<Integer>> generate(int row){
        List<List<Integer>> ans=new ArrayList<>();
        List<Integer> first=new ArrayList<>();
        first.add(1);
        ans.add(first);;
        for(int i=1;i<row;i++){
            List<Integer> prev=ans.get(i-1);
            List<Integer> curr=new ArrayList<>();
            curr.add(1);
            for(int j=1;j<i;j++){
                curr.add(prev.get(j-1)+prev.get(j));
            }
            curr.add(1);
            ans.add(curr);
        }
        return ans;
    }
    public static int ncr(int n,int r){
        long res=1;
        for(int i=0;i<r;i++){
            res=res*(n-i);
            res=res/(i+1);
        }
        return (int)res;
    }
    public static void print(int n){
        int ans=1;
        System.out.println(ans+" ");
        for(int i=1;i<n;i++){
            ans=ans*(n-1);
            ans=ans/i;
            System.out.print(ans+" ");
        }
        System.out.println();
    }
}