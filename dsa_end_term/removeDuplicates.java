package dsa_end_term;
import java.util.HashSet;
import java.util.Set;
public class removeDuplicates {
    public int brute(int[] nums) {
        Set<Integer> set=new HashSet<>();
        for(int i=0;i<nums.length;i++){
            set.add(nums[i]);
        }
        int idx=0;
        for(int it:set){
            nums[idx]=it;
            idx++;
        }
        return idx;
    }
    public static int optimal(int[] arr){
        int n=arr.length;
        int i=0;
        for(int j=1;j<n;j++){
            if(arr[j]!=arr[i]){
                arr[i+1]=arr[j];
                i++;
            }
        }
        return (i+1);
    }
}