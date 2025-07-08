package dsa_end_term;

public class containerWithMostWater{
    public int maxArea(int[] height) {
        int n=height.length;
        int i=0,j=n-1,ans=0;
        while(i<j){
            int w=j-i,h=Math.min(height[i],height[j]);
            int area=w*h;
            ans=Math.max(area,ans);
            if(height[i]<height[j])i++;
            else j--;
        }
        return ans;
    }
}