public class q19besttimetobuyandsell {
    public static int besttime(int[] arr){
        int n=arr.length;
        int mini=arr[0];
        int maxProfit=0;
        for(int i=1;i<n;i++){
            int cost=arr[i]-mini;
            maxProfit=Math.max(maxProfit,cost);
            mini=Math.min(mini, arr[i]);
        }
        return maxProfit;
    }
}   