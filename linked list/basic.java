public class basic{
    public static void insertAtEnd(Node head,int val){
        Node temp=new Node(val);
        Node t=head;
        while(t.next!=null){
            t=t.next;
        }
        t.next=temp;
    }
    public static int length(Node a){
        int count=0;
        while(a!=null){
            count++;
            a=a.next;
        }
        return count;
    }
    public static Node nthnode(Node head,int n){
        int count=0;
        Node temp=head;
        while(temp!=null){
            count++;
            temp=temp.next;
        }
        int m=count-n+1;
        temp=head;
        for(int i=1;i<=count-1;i++){
            temp =temp .next;
        }
        return temp;
    }
    public static Node nthNodeFastSlowMethod(Node head,int n){
        Node slow=head;
        Node fast=head;
        for(int i=1;i<=n;i++){
            fast=fast.next;
        }
        while(fast!=null){
            slow=slow.next;
            fast=fast.next;
        }
        return slow;
    }
    public static void display(Node head){
        Node temp=head;
        while(temp!=null){
            System.out.print(temp.data+" ");
            temp=temp.next;
        }
    }
    public static void displayRecurrsevily(Node head){
        if(head==null)return;
        System.out.print(head.data+" ");
        displayRecurrsevily(head.next);
    }
    public static void displayRecurrsevilyInReverse(Node head){
        if(head==null)return;
        displayRecurrsevilyInReverse(head.next);
        System.out.print(head.data+" ");
    }
    public static class Node{
        int data; //value
        Node next; //adress of next
        Node(int data){
            this.data=data; //constructor
        }       
    }
    public static void main(String[] args) {
        Node a=new Node(5);//head
        System.out.println(a); //$Node@2f92e0f4
        System.out.println(a.data); //5
        System.out.println(a.next); //null as not linked
        Node b=new Node(3);
        Node c=new Node(9);
        Node d=new Node(8);
        Node e=new Node(16);//tail
        //5 3 9 8 16
        a.next=b;
        //5->3 9 8 16
        System.out.println(a); //$Node@2f92e0f4
        System.out.println(a.data); //5
        System.out.println(a.next); //$Node@28a418fc // same as of b
        System.out.println(b); //$Node@28a418fc //same as linked
        System.out.println(b.data); //3
        //printing a linked llist
        //sasta method
        System.out.println(a.data);//a - 5
        System.out.println(a.next.data); //b -3
        b.next=c;
        c.next=d;
        d.next=e;
        //5->3->9->8->16
        System.out.println(a.next.next.data); //c -9
        System.out.println(a.next.next.next.data); //d -8
        System.out.println(a.next.next.next.next.data); //e -16
        //badhiya method
        Node temp=a;
        //System.out.println(temp.data);// 5 -a
        for(int i=1;i<=5;i++){
            System.out.print(temp.data + " "); // 5 3 9 8 16
            temp=temp.next;
        }
        //best method
        while(temp!=null){
            System.out.print(temp.data+" ");
            temp=temp.next;
        }
        System.out.println();
        //using function
        display(a);
        System.out.println();
        //using recurrssiion
        displayRecurrsevily(a);
        System.out.println();
        //reverse print
        displayRecurrsevilyInReverse(a);
        System.out.println();
        //length methods
        System.out.println(length(a));
    }
}