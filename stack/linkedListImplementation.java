public class linkedListImplementation {
    public static class Node {
        int val;
        Node next;
        Node(int val) {
            this.val = val;
        }
    }
    public static class LLStack {
        private Node head = null;
        private int size = 0;       
        void push(int x) {
            Node temp = new Node(x);
            temp.next = head;
            head = temp;
            size++;
        }       
        int size() {
            return size;
        }        
        int pop() {
            if (head == null) {
                System.out.println("Stack is empty");
                return -1;
            }
            int x = head.val;
            head = head.next;
            size--;
            return x;
        }        
        int peek() {
            if (head == null) {
                System.out.println("Stack is empty");
                return -1;
            }
            return head.val;
        }        
        boolean isEmpty() {
            return size == 0;
        }        
        void displayRecursively(Node head) {
            if (head == null) return;
            displayRecursively(head.next);
            System.out.print(head.val + " ");
        }       
        void display() {
            displayRecursively(head);
            System.out.println();
        }
    }   
    public static void main(String[] args) {
        LLStack st = new LLStack();
        st.push(4);
        st.push(5);
        st.push(1); 
        st.display();
        st.push(2);
        st.display();
        st.pop();
        st.display();
        System.out.println(st.size());
        System.out.println(st.peek());
        System.out.println(st.isEmpty());
        st.display();
    }
}