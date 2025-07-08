import java.util.*;
public class reverseQueue {
    public static void reverseFirstK(Queue<Integer> queue, int k) {
        if (queue == null || k < 0 || k > queue.size()) {
            throw new IllegalArgumentException("Invalid input");
        }
        if (k == 0) {
            return; // nothing to reverse
        }
        Stack<Integer> stack = new Stack<>();
        //Push the first k elements into a stack
        for (int i = 0; i < k; i++) {
            stack.push(queue.remove());
        }
        //Pop from stack and enqueue back to queue (this reverses order)
        while (!stack.isEmpty()) {
            queue.add(stack.pop());
        }        
        //Move the remaining (size - k) elements to the back
        for (int i = 0; i < queue.size() - k; i++) {
            queue.add(queue.remove());
        }
    }
    public static void main(String[] args){
        Queue<Integer> q=new LinkedList<>();
        q.add(1);
        q.add(2);
        q.add(3);
        q.add(4);
        q.add(5);
        System.out.println(q);
        Stack<Integer> st=new Stack<>();
        while(q.size()>0){
            st.push(q.remove());
        }
        while(st.size()>0){
            q.add(st.pop());
        }
        System.out.println(q);
        reverseFirstK(q, 2);
        System.out.println(q);
    }
}