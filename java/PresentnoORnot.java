
import java.util.*;

public class PresentnoORnot {

    static int[] makeFrequencyArray(int[]arr){
        int[] freq=new int[10005];
        for (int i = 0; i < arr.length; i++) {
            freq[arr[i]]++;
        }
        return freq; 
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i]=sc.nextInt();           
        }
        int[]freq = makeFrequencyArray(arr);

        System.out.println("enter no of queries");
        int q=sc.nextInt();

        while(q>0){
            System.out.println("enter no to be searched");
            int x = sc.nextInt();
            if (freq[x]>0){
                System.out.println("yes");
            }
            else{
                System.out.println("no");
            }
            q--;
        }
    }
}
