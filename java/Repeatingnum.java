import java.util.*;
public class Repeatingnum {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        int n=  sc.nextInt();
        int [] arr= new int[n];
        for(int i=0; i<n; i++){
            arr[i]=sc.nextInt();
        }
        System.out.println(repeating(arr));
    }

    static int repeating (int[] arr){
        int n=arr.length;
        for(int i=0;i<n;i++){
            for(int j=i+1;j<n;j++){
                if(arr[i]==arr[j]){
                    return arr[i];
                }
            }
        }
        return -1;
    }
}
