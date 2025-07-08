package dsa_end_term;
import java.util.HashMap;
import java.util.Map;
public class subArraysum {
        public int subarraySum(int[] nums, int k) {
        Map<Integer,Integer> prefSum=new HashMap<>();
        prefSum.put(0,1);
        int currSum=0,count=0;
        for(int num:nums){
            currSum+=num;
            int rest=currSum-k;
            if(prefSum.containsKey(rest)){
                count+=prefSum.get(rest);
            }
            prefSum.put(currSum,prefSum.getOrDefault(currSum,0)+1);
        }
        return count;
    }
    public int subarraySumBetter(int[] nums, int k) {
        int n=nums.length;
        int c=0;
        for(int i=0;i<n;i++){
            int sum=0;
            for(int j=i;j<n;j++){
                sum+=nums[j];
                if(sum==k)c++;
            }
        }
        return c;
    }
}
