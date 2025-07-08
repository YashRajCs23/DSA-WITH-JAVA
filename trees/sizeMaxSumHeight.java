import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
public class sizeMaxSumHeight {
    public static class Node {
        int val;
        Node left;
        Node right;
        
        public Node(int val) {
            this.val = val;
        }
    }
    public static void preorder(Node root) {
        if(root == null) return;
        System.out.print(root.val + " ");
        preorder(root.left);
        preorder(root.right);
    }
    public static void postorder(Node root) {
        if(root == null) return;
        postorder(root.left);
        postorder(root.right);
        System.out.print(root.val + " ");
    } 
    public static void inorder(Node root) {
        if(root == null) return;
        inorder(root.left);
        System.out.print(root.val + " ");
        inorder(root.right);
    }
    public static int size(Node root) {
        if(root == null) return 0;
        return 1 + size(root.left) + size(root.right);
    }
    public static int sum(Node root) {
        if(root == null) return 0;
        return root.val + sum(root.left) + sum(root.right);
    }
    public static int max(Node root) {
        if(root == null) return Integer.MIN_VALUE;
        return Math.max(root.val, Math.max(max(root.left), max(root.right)));
    }
    public static int min(Node root) {
        if(root == null) return Integer.MAX_VALUE;
        return Math.min(root.val, Math.min(min(root.left), min(root.right)));
    }
    public static int height(Node root) {
        if(root == null || (root.left == null && root.right == null)) return 0;
        return 1 + Math.max(height(root.left), height(root.right));
    }
    public static int product(Node root) {
        if(root == null) return 1;
        return root.val * product(root.left) * product(root.right);
    }
    public static void nthLevel(Node root, int n) {
        if(root == null) return;
        if(n == 1) {
            System.out.print(root.val + " ");
            return;
        }
        nthLevel(root.left, n - 1);
        nthLevel(root.right, n - 1);
    }
    public static void bfs(Node root) {
        Queue<Node> q = new LinkedList<>();
        if(root != null) q.add(root);
        while(q.size() > 0) {
            Node temp = q.peek();
            if(temp.left != null) q.add(temp.left);
            if(temp.right != null) q.add(temp.right);
            System.out.print(temp.val + " ");
            q.remove();
        }
    }
//NODE TO ROOT PATH
    public static List<Integer> nodeToRootPath(Node root, int target) {
        List<Integer> path = new ArrayList<>();
        findPath(root, target, path);
        return path;
    }
    private static boolean findPath(Node node, int target, List<Integer> path) {
        if(node == null) return false;
        if(node.val == target) {
            path.add(node.val);
            return true;
        }
        if(findPath(node.left, target, path) || findPath(node.right, target, path)) {
            path.add(node.val);
            return true;
        }
        return false;
    }
    public static void main(String[] args) {
        Node root = new Node(1);
        Node a = new Node(2);
        Node b = new Node(3);
        root.left = a;
        root.right = b;
        Node c = new Node(4);
        Node d = new Node(5);
        a.left = c;
        a.right = d;
        Node e = new Node(6);
        b.right = e;
        System.out.println("Preorder traversal:");
        preorder(root);
        System.out.println("\nSize: " + size(root));
        System.out.println("Sum: " + sum(root));
        System.out.println("Max: " + max(root));
        System.out.println("Min: " + min(root));
        System.out.println("Height: " + height(root));
        System.out.println("Product: " + product(root));       
        System.out.println("\nBFS traversal:");
        bfs(root);       
        System.out.println("\n\nNode to root path for 6:");
        List<Integer> path = nodeToRootPath(root, 6);
        System.out.println(path);
    }
}