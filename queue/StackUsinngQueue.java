import java.util.LinkedList;
import java.util.Queue;
public class StackUsinngQueue {
    Queue<Integer> q = new LinkedList<>();    
    public void push(int x) {
        q.add(x);
    }   
    public int pop() {
        if (empty()) {
            throw new RuntimeException("Stack is empty");
        }
        for (int i = 1; i <= q.size() - 1; i++) {
            q.add(q.remove());
        }
        return q.remove();
    }   
    public int top() {
        if (empty()) {
            throw new RuntimeException("Stack is empty");
        }
        for (int i = 1; i <= q.size() - 1; i++) {
            q.add(q.remove());
        }
        int val = q.peek();
        q.add(q.remove());
        return val;
    }    
    public boolean empty() {
        return q.size() == 0;
    }
}