public class reverese {
    public static class Node{
        int data;
        Node next;
        Node(int data){
            this.data=data;
        }
    }
    public Node reverseList(Node head) {
        Node curr=head;
        Node prev=null;
        Node after=null;
        while(curr!=null){
            after=curr.next;
            curr.next=prev;
            prev=curr;
            curr=after;
        }
        return prev;
    }
    public static class linkedlist{
        Node head=null;
        Node tail=null;
        int size=0;
        void insertAtEnd(int val){
            Node temp=new Node(val);
            if(head==null){ //empty list
                head=temp;
            }
            else{ // NON EMPTYLIST
                tail.next=temp;
            }
            tail=temp;
            size++;
        }
        void display(){
            Node temp=head;
            while(temp!=null){
                System.out.print(temp.data+" ");
                temp=temp.next;
            }
            System.out.println();
        }
        // int size(){
        //     Node temp=head;
        //     int count=0;
        //     while(temp!=null){
        //         count++;
        //         temp=temp.next;
        //     }
        //     return count;
        // }
        void insertAtHead(int val){
            Node temp=new Node(val);
            if(head==null) insertAtEnd(val);// OR   head=tail=temp; // EMPTY LIST
            else{ // NON EMPTYLIST
                temp.next=head;
                head=temp;
            }
            size++;
        }
        void insertAt(int idx,int val){
            Node t=new Node(val);
            Node temp=head;
            if(idx==size){
            // if(idx==size()){ //at end
                insertAtEnd(val);
                return;
            }
            else if(idx==0){ //at beginnning
                insertAtHead(val);
                return;
            }
            else if(idx>size){ //base case
                System.out.println("wrong idx");
                return;
            }
            else if(idx<0){ //base case
                System.out.println("wrong idx");
                return;
            }
            //at any idx except start and end
            for(int i=1;i<=idx-1;i++){
                temp=temp.next;
            }
            t.next=temp.next;
            temp.next=t;
            size++;
        }
        int getAt(int idx){
            if(idx>size){ //base case
                System.out.println("wrong idx");
                return -1;
            }
            else if(idx<0){ //base case
                System.out.println("wrong idx");
                return -1;
            }
            Node temp=head;
            for(int i=1;i<=idx;i++){
                temp=temp.next;
            }
            return temp.data;
        }
        void deleteAt(int idx){
            Node temp=head;
            if(idx==0){ //for 0 index
                head=head.next;
                size--;
                return;
            } 
            for(int i=1;i<=idx-1;i++){
                temp=temp.next;
            }
            temp.next=temp.next.next;
            tail=temp;//for setting tail to the last
            size--;
        }
    }
        public static void main(String[] args) {
            linkedlist ll=new linkedlist();

    }
}
