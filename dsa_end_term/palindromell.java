package dsa_end_term;


import java.util.Stack;

public class palindromell{
    public static class ListNode{
        int data; //value
        ListNode next; //adress of next
        ListNode(int data){
            this.data=data; //constructor
        }       
    }
    public boolean isPalindrome(ListNode head) {
        if(head==null||head.next==null)return true;
        Stack<Integer> st=new Stack<>();
        ListNode temp=head;
        while(temp!=null){
            st.push(temp.data);
            temp=temp.next;
        }
        temp=head;
        while(temp!=null){
            if(temp.data!=st.peek())return false;
            st.pop();
            temp=temp.next;
        }
        return true;
    }
}