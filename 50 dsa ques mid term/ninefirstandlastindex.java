public class ninefirstandlastindex {
    public static int[] firstandlast(int[] arr,int target){
        int n=arr.length;
        int ans[]={-1,-1};
        int start=0,end=n-1;
        //lower bound
        while(start<=end){
            int mid=start+(end-start)/2;
            if(arr[mid]>=target) end=mid-1;
            else start=mid+1;
        }
        //target doesnt exist
        if(start>=n || arr[start]!=target) return ans;
        ans[0]=start;//first ocuurence
        end=n-1;
        while(start<=end){
            int mid=start+(end-start)/2;
            if(arr[mid]>target) end=mid-1;
            else start=mid+1;
        }
        ans[1]=end;
        return ans;
    }
}