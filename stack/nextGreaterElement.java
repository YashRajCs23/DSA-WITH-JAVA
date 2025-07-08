import java.util.Arrays;
import java.util.Stack;
public class nextGreaterElement {
    public static int[] next(int[] arr){
        int[] res=new int[arr.length];
        int n=arr.length;
        res[n-1]=-1;
        Stack<Integer> st=new Stack<>();
        st.push(arr[n-1]);
        for(int i=n-2;i>=0;i--){
            while(!st.isEmpty() && st.peek()<=arr[i]){
                st.pop();
            }
            if(st.size()==0)res[i]=-1;
            else res[i]=st.peek();
            st.push(arr[i]);
        }
        return res;
    }
    public static void main(String[] args) {
        int[] arr={1,3,2,1,8,6,3,4};
        int[] res=next(arr);
        // for(int i=0;i<arr.length;i++){
        //     res[i]=-1;
        //     for(int j=i+1;j<arr.length;j++){
        //         if(arr[j]>arr[i]){
        //             res[i]=arr[j];
        //             break;
        //         }
        //     }
        // }
        // for(int i=0;i<arr.length;i++){
        //     System.out.print(arr[i]+" ");
        // }
        // System.out.println();
        // for(int i=0;i<res.length;i++){
        //     System.out.print(res[i]+" ");
        // }
        System.out.println(Arrays.toString(res));
    }
}