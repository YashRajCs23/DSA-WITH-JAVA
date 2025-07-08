package dsa_end_term;

public class moveZeroes {
    public static void swap(int[] nums,int i,int j){
        int temp=nums[i];
        nums[i]=nums[j];
        nums[j]=temp;
    }
    public static void move(int[] arr){
        int j=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]!=0){
                swap(arr, i, j);
                j++;
            }
        }
    }
}