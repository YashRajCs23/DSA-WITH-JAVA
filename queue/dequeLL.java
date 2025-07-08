import java.util.NoSuchElementException;

public class dequeLL {
    public class LinkedListDeque<T> {
        private static class Node<T> {
            T data;
            Node<T> prev;
            Node<T> next;
            Node(T data) {
                this.data = data;
                this.prev = null;
                this.next = null;
            }
        }

        private Node<T> head;
        private Node<T> tail;
        private int size;

        public LinkedListDeque() {
            head = null;
            tail = null;
            size = 0;
        }

        public void addFirst(T item) {
            Node<T> newNode = new Node<>(item);
            if (isEmpty()) {
                head = tail = newNode;
            } else {
                newNode.next = head;
                head.prev = newNode;
                head = newNode;
            }
            size++;
        }

        public void addLast(T item) {
            Node<T> newNode = new Node<>(item);
            if (isEmpty()) {
                head = tail = newNode;
            } else {
                tail.next = newNode;
                newNode.prev = tail;
                tail = newNode;
            }
            size++;
        }

        public T removeFirst() {
            if (isEmpty()) {
                throw new NoSuchElementException("Deque is empty");
            }
            T item = head.data;
            if (head == tail) {
                head = tail = null;
            } else {
                head = head.next;
                head.prev = null;
            }
            size--;
            return item;
        }

        public T removeLast() {
            if (isEmpty()) {
                throw new NoSuchElementException("Deque is empty");
            }
            T item = tail.data;
            if (head == tail) {
                head = tail = null;
            } else {
                tail = tail.prev;
                tail.next = null;
            }
            size--;
            return item;
        }

        public T peekFirst() {
            if (isEmpty()) {
                throw new NoSuchElementException("Deque is empty");
            }
            return head.data;
        }

        public T peekLast() {
            if (isEmpty()) {
                throw new NoSuchElementException("Deque is empty");
            }
            return tail.data;
        }

        public boolean isEmpty() {
            return size == 0;
        }

        public int size() {
            return size;
        }

        @Override
        public String toString() {
            if (isEmpty()) {
                return "[]";
            }
            StringBuilder sb = new StringBuilder("[");
            Node<T> current = head;
            while (current != null) {
                sb.append(current.data);
                if (current.next != null) {
                    sb.append(", ");
                }
                current = current.next;
            }
            sb.append("]");
            return sb.toString();
        }
    }
}