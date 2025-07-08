import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;
// class llist{
//     int data;
//     llist next;
//     public llist(int data) {
//         this.data=data;
//         next=null;
//     }    
// }
public class Collection {
    public static void main(String[] args) {
    //    llist l1=new llist(10);
    //    llist l2=new llist(20);
    //    llist l3=new llist(30);
    //    llist l4=new llist(40);
    //    l1.next=l2;
    //    l2.next=l3;
    //    l3.next=l4;
    //    llist temp=l1;
    // while(temp!=null){
    //     System.out.println(temp.data);
    //     temp=temp.next;
    // }
   // LinkedList<Integer> l=new LinkedList<Integer>();//collection
   Set<Integer> s1=new HashSet<>();
    s1.add(10);
    s1.add(20);
    s1.add(30);
    s1.add(40);
    System.out.println(s1);
    Set<Integer> s2=new LinkedHashSet<>();
    s2.add(10);
    s2.add(20);
    s2.add(30);
    s2.add(40);
    System.out.println(s2);
    Set<Integer> s3=new TreeSet<>();
    s3.add(10);
    s3.add(20);
    s3.add(30);
    s3.add(40);
    System.out.println(s3);
    // s1.remove(1);
    // System.out.println(l);
    // System.out.println(l.size());
    }    
}