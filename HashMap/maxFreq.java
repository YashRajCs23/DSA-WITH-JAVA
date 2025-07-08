import java.util.HashMap;
import java.util.Scanner;
public class maxFreq {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        HashMap<Integer,Integer> freq=new HashMap<>();
        for(int el:arr){
            if(!freq.containsKey(el)){
                freq.put(el, 1);
            }else{
                freq.put(el, freq.get(el)+1);
            }
        }
        System.out.println(freq.entrySet());
        int maxFreq=0,ansKey=-1;
        for(var e:freq.entrySet()){
            if(e.getValue()>maxFreq){
                maxFreq=e.getValue();
                ansKey=e.getKey();
            }
        }
        // for(var key:freq.keySet()){ Method 2
        //     if(freq.keySet()>maxFreq){
        //         maxFreq=freq.get(key);
        //         ansKey=key;
        //     }
        // }
        System.out.println(ansKey);
    }
}