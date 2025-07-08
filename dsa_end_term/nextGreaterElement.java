package dsa_end_term;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Stack;
public class nextGreaterElement {
    public static int[] next(int nums1[],int nums2[]){
        int res[]=new int[nums1.length];
        HashMap<Integer,Integer> map=new HashMap<>();
        Stack<Integer>st=new Stack<>();
        for(int i=0;i<nums2.length;i++){
            while(!st.isEmpty()&&st.peek()<nums2[i])map.put(st.pop(),nums2[i]);
            st.push(nums2[i]);
        }
        for(int i:st)map.put(i,-1);
        for(int i=0;i<nums1.length;i++){
            res[i]=map.get(nums1[i]);
        }
        return res;
    }
    public ArrayList<Integer> nextLargerElement(int[] arr) {
        int n=arr.length;
        int[] res=new int[n];
        Stack<Integer>st=new Stack<>();
        for(int i=n-1;i>=0;i--){
            while(!st.isEmpty()&&st.peek()<=arr[i])st.pop();
            if(st.isEmpty()) res[i]=-1;
            else res[i]=st.peek();
            st.push(arr[i]);
        }
        ArrayList<Integer> ans=new ArrayList<>();
        for(int num:res)ans.add(num);
        return ans;
    }
}