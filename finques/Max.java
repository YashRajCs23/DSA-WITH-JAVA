// package finques;
import java.util.*;
public class Max {
    public static void main(String[] args) {
        int[] arr={1,2,3,2,4,5,2,6,2,9};
        Map<Integer,Integer>freq=new HashMap<>();
        for(int el:arr){
            if(!freq.containsKey(el)){
                freq.put(el, 1);
            }
            else{
                freq.put(el, freq.get(el)+1);
            }
        }
        int maxFreq=0,ansKey=-1;
        for (var e : freq.entrySet()) {
    if(e.getValue()>maxFreq){
        maxFreq=e.getValue();
        ansKey=e.getKey();
    }            
        }
        System.out.println(ansKey);
    }
}
