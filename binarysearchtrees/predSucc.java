package binarysearchtrees;

public class predSucc {
    static class Node {
        int key;
        Node left, right;
    
        public Node(int item) {
            key = item;
            left = right = null;
        }
    }
    
    public static class BST {
    
        static Node predecessor = null;
        static Node successor = null;
    
        public static void findPreSuc(Node root, int key) {
            if (root == null) return;
    
            if (root.key == key) {
                // Find predecessor (max value in left subtree)
                if (root.left != null) {
                    Node temp = root.left;
                    while (temp.right != null)
                        temp = temp.right;
                    predecessor = temp;
                }
    
                // Find successor (min value in right subtree)
                if (root.right != null) {
                    Node temp = root.right;
                    while (temp.left != null)
                        temp = temp.left;
                    successor = temp;
                }
            }
            else if (key < root.key) {
                successor = root;
                findPreSuc(root.left, key);
            }
            else {
                predecessor = root;
                findPreSuc(root.right, key);
            }
        }
    
        public static void printPreSuc() {
            System.out.println("Predecessor: " + (predecessor != null ? predecessor.key : "None"));
            System.out.println("Successor: " + (successor != null ? successor.key : "None"));
        }
    
        public static void main(String[] args) {
            Node root = new Node(50);
            root.left = new Node(30);
            root.right = new Node(70);
            root.left.left = new Node(20);
            root.left.right = new Node(40);
            root.right.left = new Node(60);
            root.right.right = new Node(80);
    
            int key = 65;
            findPreSuc(root, key);
            printPreSuc();
        }
    }
}