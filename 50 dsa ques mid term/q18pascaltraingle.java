
import java.util.ArrayList;
import java.util.List;

public class q18pascaltraingle{
    public static int Ncr(int n,int r){ //to find a particular element
        long res=1;
        for(int i=0;i<r;i++){
            res=res*(n-i);
            res=res/(i+1);
        }
        return (int)res;
    }

    //print any given row
    public static void row(int n){
        long ans=1;
        if(ans==1) System.out.println(1);
        for(int i=1;i<n;i++){
            ans=ans*(n-i);
            ans=ans/(i);
            System.out.print(ans);
        }
        System.out.println();
    }

    //print pascal triangle
    public static List<List<Integer>> pascal(int n){
        List<List<Integer>> triangle = new ArrayList<>();
        // Base case: First row is always [1]
        List<Integer> firstRow = new ArrayList<>();
        firstRow.add(1);
        triangle.add(firstRow);
        // Generate subsequent rows
        for (int i = 1; i < n; i++) {
            List<Integer> prevRow = triangle.get(i - 1); // Get the previous row
            List<Integer> currRow = new ArrayList<>();
            // First element of the current row is always 1
            currRow.add(1);
            // Calculate middle elements
            for (int j = 1; j < i; j++) {
                currRow.add(prevRow.get(j - 1) + prevRow.get(j));
            }
            // Last element of the current row is always 1
            currRow.add(1);
            // Add the current row to the triangle
            triangle.add(currRow);
        }
        return triangle;
    }
}