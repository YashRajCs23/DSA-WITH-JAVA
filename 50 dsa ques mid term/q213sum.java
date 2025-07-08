import java.util.*;

public class q213sum {
    public List<List<Integer>> threeSum(int[] arr) {
        int target = 0;
        Arrays.sort(arr);
        Set<List<Integer>> ans = new HashSet<>();
        List<List<Integer>> output = new ArrayList<>();

        for (int i = 0; i < arr.length - 2; i++) {
            int j = i + 1;
            int k = arr.length - 1;
            while (j < k) {
                int sum = arr[i] + arr[j] + arr[k];
                if (sum == target) {
                    ans.add(Arrays.asList(arr[i], arr[j], arr[k]));
                    j++;
                    k--;
                } else if (sum < target) {
                    j++;
                } else {
                    k--;
                }
            }
        }

        output.addAll(ans);
        return output;
    }
}
