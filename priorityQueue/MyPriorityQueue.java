import java.util.Collections;
import java.util.PriorityQueue;
public class MyPriorityQueue {

    // Custom class for student with Comparable interface
    class NewStudent implements Comparable<NewStudent> {
        int marks;
        String name;

        // Constructor
        NewStudent(String name, int marks) {
            this.name = name;
            this.marks = marks;
        }

        // Print student details
        @Override
        public String toString() {
            return "Student name: " + this.name + ", marks: " + this.marks;
        }

        // Compare by marks, then by name
        @Override
        public int compareTo(NewStudent that) {
            if (this.marks != that.marks) {
                return this.marks - that.marks; // Ascending by marks
            }
            return this.name.compareTo(that.name); // Ascending by name
        }

        // Equality check for contains(), remove(), etc.
        @Override
        public boolean equals(Object obj) {
            if (obj instanceof NewStudent) {
                NewStudent that = (NewStudent) obj;
                return this.marks == that.marks && this.name.equals(that.name);
            }
            return false;
        }
    }

    public static void main(String[] args) {
        // ---------------- Integer PriorityQueue Examples ----------------

        PriorityQueue<Integer> minPq = new PriorityQueue<>(); // min-heap
        minPq.offer(1);
        minPq.offer(2);
        minPq.offer(10);
        minPq.offer(0);

        System.out.println("Min PQ: highest priority element -> " + minPq.peek()); // 0

        PriorityQueue<Integer> maxPq = new PriorityQueue<>(Collections.reverseOrder()); // max-heap
        maxPq.offer(1);
        maxPq.offer(2);
        maxPq.offer(10);
        maxPq.offer(0);

        System.out.println("Max PQ: highest priority element -> " + maxPq.peek()); // 10
        System.out.println("Max PQ contains 10? -> " + maxPq.contains(10));
        System.out.println("Max PQ: deleted -> " + maxPq.poll());
        System.out.println("Max PQ: new highest -> " + maxPq.peek());
        System.out.println("Max PQ contains 10? -> " + maxPq.contains(10));

        // ---------------- PriorityQueue with Custom Class ----------------

        MyPriorityQueue obj = new MyPriorityQueue(); // to access inner class

        PriorityQueue<MyPriorityQueue.NewStudent> minStudentPq = new PriorityQueue<>();

        MyPriorityQueue.NewStudent ns = obj.new NewStudent("shashwat", 80);
        minStudentPq.offer(ns);
        minStudentPq.offer(obj.new NewStudent("aman", 70));
        minStudentPq.offer(obj.new NewStudent("mohit", 90));

        System.out.println("Min Student PQ top -> " + minStudentPq.peek());
        System.out.println("Contains 'shashwat' with 80 marks? -> " + minStudentPq.contains(ns));
    }
}
