import java.util.*;
public class duplicatelist {
    public static void main(String[] args) {
        ArrayList<Integer> l1=new ArrayList<>(Arrays.asList(10,30,50,30,10));//INPUT DIRECTLY
        // l1.add(10);
        // l1.add(30);
        // l1.add(40);
        // l1.add(100);
        // l1.add(30);
        // l1.add(20);
        // l1.add(100);
        // l1.add(40);
        ArrayList<Integer> ans=new ArrayList<>();
        for(int i:l1){
            if(ans.contains(i)==false){
                ans.add(i);
            }
        }

        Iterator <Integer> it=l1.iterator();
        while(it.hasNext()){
            System.err.println(it.next());
        }
        System.out.println(ans);
    }
}
