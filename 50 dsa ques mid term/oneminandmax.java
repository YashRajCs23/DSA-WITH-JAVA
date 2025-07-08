import java.util.ArrayList;
import java.util.Scanner;
public class oneminandmax{
    public static int[] minAndMax(int[] arr){
        int n=arr.length;
        int minimum=Integer.MAX_VALUE;
        int maximum=Integer.MIN_VALUE;
        for(int num:arr){
            if(num>maximum) maximum=num;
            if(num<minimum) minimum=num;
        }
        return new int[]{minimum,maximum};
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        int[] result = minAndMax(arr);
        ArrayList<Integer> ans = new ArrayList<>();
        ans.add(result[0]);
        ans.add(result[1]); 
        System.out.println(ans);
    }
}