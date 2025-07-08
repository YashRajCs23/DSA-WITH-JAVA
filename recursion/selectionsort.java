public class selectionsort {
    public static void selectsort(int []arr){
        int n=arr.length;
        for(int i=0;i<n-1;i++){
            int mx=i;
            for (int j = i; j < n; j++) {
                if(arr[mx]>arr[j]){
                    mx=j;
                }
            }
            int temp=arr[i];
            arr[i]=arr[mx];
            arr[mx]=temp;
        }
    }
    public static void main(String[] args) {
        int []arr={1,5,4,2,3};
        selectsort(arr);
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]);
        }
    }
}