package dsa_end_term;
public class intersectionOfLL {
    public static class ListNode{
        int data; //value
        ListNode next; //adress of next
        ListNode(int data){
            this.data=data; //constructor
        }       
    }
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        if(headA==null || headB==null) return null;
        ListNode t1=headA;
        ListNode t2=headB;
        while(t1!=t2){
            t1=t1.next;
            t2=t2.next;
            if(t1==t2)return t1;
            if(t1==null)t1=headB;
            if(t2==null)t2=headA;
        }
        return t1;
    }
}
