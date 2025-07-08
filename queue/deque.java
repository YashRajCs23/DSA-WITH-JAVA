import java.util.Deque;
import java.util.LinkedList;
public class deque {
    public static void main(String[] args) {
        Deque<Integer> dq=new LinkedList<>();
        dq.addLast(1);
        dq.addLast(2);
        dq.addLast(3);
        dq.addLast(4);
        dq.addLast(5);
        System.out.println(dq);
        dq.addFirst(6);
        dq.removeLast();
        System.out.println(dq);
        dq.removeFirst();
        System.out.println(dq.getFirst());
        System.out.println(dq.getLast());
        dq.add(5);
        dq.remove();
        dq.removeAll(dq);
        dq.removeFirstOccurrence(2);
        dq.removeLastOccurrence(5);
        System.out.println(dq);
    }
}
