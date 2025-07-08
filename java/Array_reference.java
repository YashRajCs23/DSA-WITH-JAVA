import java.util.*;
public class Array_reference {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int [] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i]=sc.nextInt();
        }

        print_Arr(arr);

        int[] arr_2=arr;
        print_Arr(arr_2);
//updating value 
        arr_2[0]=0;
        arr_2[1]=99;

// printing updated arrays
        print_Arr(arr);
        print_Arr(arr_2);
    }
    static void print_Arr(int[] arr){
        for (int i = 0; i < arr.length; i++) {
         System.out.print(arr[i]+ " ");
            
        } 
        System.out.println();    
}
}