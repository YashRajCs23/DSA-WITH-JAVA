package dsa_end_term;
public class middleofll {
    public static class ListNode{
        int data; //value
        ListNode next; //adress of next
        ListNode(int data){
            this.data=data; //constructor
        }       
    }
    public ListNode middleNode(ListNode head) {//right middle
        ListNode slow=head;
        ListNode fast=head;
        while(fast!=null && fast.next!=null){
            slow=slow.next;
            fast=fast.next.next;
        }
        return slow;
    }
    public ListNode middleRightNode(ListNode head) {//right middle
        ListNode slow=head;
        ListNode fast=head;
        while(fast!=null && fast.next.next!=null){
            slow=slow.next;
            fast=fast.next.next;
        }
        return slow;
    }
}
