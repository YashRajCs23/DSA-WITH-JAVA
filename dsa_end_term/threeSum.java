package dsa_end_term;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
public class threeSum {
    public List<List<Integer>> brute(int[] nums) {
        int n=nums.length;
        Set<List<Integer>> ans=new HashSet<>();
        for(int i=0;i<n;i++){
            for(int j=i+1;j<n;j++){
                for(int k=j+1;k<n;k++){
                    int sum=nums[i]+nums[j]+nums[k];
                    if(sum==0){
                        List<Integer> triplet=Arrays.asList(nums[i],nums[j],nums[k]);
                        Collections.sort(triplet);
                        ans.add(triplet);
                    }
                }
            }
        }
        return new ArrayList<>(ans);
    }
    public List<List<Integer>> optimal(int[] nums) {
        int n=nums.length;
        int target=0;
        Arrays.sort(nums);
        Set<List<Integer>> ans=new HashSet<>();
        List<List<Integer>> output=new ArrayList<>();
        for(int i=0;i<n;i++){
            int j=i+1;
            int k=n-1;
            while(j<k){
                    int sum=nums[i]+nums[j]+nums[k];
                    if(sum==target){
                    ans.add(Arrays.asList(nums[i],nums[j],nums[k]));
                    j++;
                    k--;
                    }
                    else if(sum<target)j++;
                    else k--;
                }
            }
            output.addAll(ans);
            return output;
        }
    }
