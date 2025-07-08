package binarysearchtrees;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
public class basics {
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
    public Node searchBST(Node root, int val) {
        if(root==null) return null;
        if(root.val==val) return root;
        else if(root.val>val) return searchBST(root.left,val);
        else return searchBST(root.right,val);
    }
    public Node insertIntoBST(Node root, int val) {
        if(root==null) return new Node(val);
        if(root.val>val) {
            if(root.left==null) root.left = new Node(val);
            else insertIntoBST(root.left,val);
        }
        else {
            if(root.right==null) root.right = new Node(val);
            else insertIntoBST(root.right,val);
        }
        return root;
    }
    public static Node constructBfs(String[] arr) {
        if(arr == null || arr.length == 0 || arr[0].equals("null")) return null;
        Node root = new Node(Integer.parseInt(arr[0]));
        Queue<Node> q = new LinkedList<>();
        q.add(root);
        int i = 1;
        while(!q.isEmpty() && i < arr.length) {
            Node current = q.poll();
            if(i < arr.length && !arr[i].equals("null")) {
                current.left = new Node(Integer.parseInt(arr[i]));
                q.add(current.left);
            }
            i++;
            if(i < arr.length && !arr[i].equals("null")) {
                current.right = new Node(Integer.parseInt(arr[i]));
                q.add(current.right);
            }
            i++;
        }
        return root;
    }
    public static void delete(Node root,int target){
        if(root==null) return;
        if(root.val>target){
            if(root.left==null) return;
            if(root.left.val==target){
                Node l=root.left;
                if(l.left==null&&l.right==null)l=null;
                else if(l.left==null||l.right==null)l=(l.left!=null)?l.left:l.right;
                else{
                    Node curr=l;
                    Node pred=curr.left;
                    while(pred.right!=null) pred=pred.right;
                    delete(root,pred.val);
                    pred.left=curr.left;
                    pred.right=curr.right;
                    root.left=pred;
                }
            }else delete(root.left,target);
        }else{
            if(root.right==null) return;
            if(root.right.val==target){
                Node r=root.right;
                if(r.left==null&&r.right==null){
                    root.right=null;
                }
                else if(r.left==null||r.right==null){
                    root.right=(r.left!=null)?r.left:r.right;
                }
                else{
                    Node curr=r;
                    Node pred=curr.left;
                    while(pred.right!=null) pred=pred.right;
                    delete(root,pred.val);
                    pred.left=curr.left;
                    pred.right=curr.right;
                    root.right=pred;
                }
            }else delete(root.right,target);
        }
    }
    public static void inorder1(Node root,List<Integer> a){
        if(root == null) return;
        inorder1(root.left,a);
        a.add(root.val);
        inorder1(root.right,a);
    }
    public static void main(String[] args) {
        String[] arr = {"10","5","15","2","8","12","17"};
        Node root = constructBfs(arr);
        System.out.print("Preorder traversal: ");
        preorder(root);
        System.out.println();
        System.out.print("Postorder traversal: ");
        postorder(root);
        System.out.println();
        System.out.print("Inorder traversal: ");
        inorder(root);
        System.out.println();
        delete(root,17);
        List<Integer> a=new ArrayList<>();
        inorder1(root,a);
        int val=28;
        int idx=-1;
        for(int i=0;i<a.size();i++){
            if(a.get(i)==val){
                idx=i;
                break;
            }
        }
        int pred=a.get(idx-1);
        System.out.println("pred is"+pred);
        int succ=a.get(idx+1);
        System.out.println("succ is"+succ);
    }
}