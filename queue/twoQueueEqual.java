import java.util.LinkedList;
import java.util.Queue;
public class twoQueueEqual {
    public static void main(String[] args) {
        Queue<Integer> q=new LinkedList<>();
        q.add(1);
        q.add(2);
        q.add(3);
        q.add(4);
        q.add(5);
        System.out.println(q);
        Queue<Integer> q1=new LinkedList<>();
        q1.add(11);
        q1.add(2);
        q1.add(3);
        q1.add(4);
        q1.add(5);
        System.out.println(q);
        boolean eq=q.equals(q1);
        System.out.println(eq);
    }
}