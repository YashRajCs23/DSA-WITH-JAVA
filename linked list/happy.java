public class happy{
    public static class Node {
        char data;
        Node next;
    
        public Node(char data) {
            this.data = data;
            this.next = null;
        }
    }
    
    public static class LinkedList {
        Node head;
    
        // Method to add a new node at the end
        public void append(char data) {
            Node newNode = new Node(data);
            
            if (head == null) {
                head = newNode;
                return;
            }
            
            Node last = head;
            while (last.next != null) {
                last = last.next;
            }
            
            last.next = newNode;
        }
    
        // Method to print the linked list with spaces
        public void printList() {
            Node current = head;
            while (current != null) {
                System.out.print(current.data);
                if (current.next != null) {
                    System.out.print(" ");
                }
                current = current.next;
            }
            System.out.println();
        }
    }
    
    public static void main(String[] args) {
        LinkedList messageList = new LinkedList();
        
        // Add each character to the linked list
        char[] message = {'h', 'a', 'p', 'p', 'y', 'b', 'i', 'r', 't', 'h', 'd', 'a', 'y'};
        
        for (char c : message) {
            messageList.append(c);
        }
        
        // Print the linked list
        messageList.printList();
    }
}