import java.util.NoSuchElementException;

public class dequeArray {
    public class ArrayDeque<T> {
        private static final int DEFAULT_CAPACITY = 10;
        private T[] elements;
        private int front;
        private int rear;
        private int size;

        @SuppressWarnings("unchecked")
        public ArrayDeque() {
            elements = (T[]) new Object[DEFAULT_CAPACITY];
            front = -1;
            rear = 0;
            size = 0;
        }

        @SuppressWarnings("unchecked")
        public ArrayDeque(int capacity) {
            elements = (T[]) new Object[capacity];
            front = -1;
            rear = 0;
            size = 0;
        }

        public void addFirst(T item) {
            if (isFull()) {
                resize();
            }
            if (front == -1) {
                front = 0;
                rear = 0;
            } else if (front == 0) {
                front = elements.length - 1;
            } else {
                front--;
            }
            elements[front] = item;
            size++;
        }

        public void addLast(T item) {
            if (isFull()) {
                resize();
            }
            if (front == -1) {
                front = 0;
                rear = 0;
            } else if (rear == elements.length - 1) {
                rear = 0;
            } else {
                rear++;
            }
            elements[rear] = item;
            size++;
        }

        public T removeFirst() {
            if (isEmpty()) {
                throw new NoSuchElementException("Deque is empty");
            }
            T item = elements[front];
            elements[front] = null;
            if (front == rear) {
                front = -1;
                rear = -1;
            } else if (front == elements.length - 1) {
                front = 0;
            } else {
                front++;
            }
            size--;
            return item;
        }

        public T removeLast() {
            if (isEmpty()) {
                throw new NoSuchElementException("Deque is empty");
            }
            T item = elements[rear];
            elements[rear] = null;
            if (front == rear) {
                front = -1;
                rear = -1;
            } else if (rear == 0) {
                rear = elements.length - 1;
            } else {
                rear--;
            }
            size--;
            return item;
        }

        public T peekFirst() {
            if (isEmpty()) {
                throw new NoSuchElementException("Deque is empty");
            }
            return elements[front];
        }

        public T peekLast() {
            if (isEmpty()) {
                throw new NoSuchElementException("Deque is empty");
            }
            return elements[rear];
        }

        public boolean isEmpty() {
            return size == 0;
        }

        public boolean isFull() {
            return size == elements.length;
        }

        public int size() {
            return size;
        }

        @SuppressWarnings("unchecked")
        private void resize() {
            T[] newElements = (T[]) new Object[elements.length * 2];
            if (front <= rear) {
                System.arraycopy(elements, front, newElements, 0, size);
            } else {
                System.arraycopy(elements, front, newElements, 0, elements.length - front);
                System.arraycopy(elements, 0, newElements, elements.length - front, rear + 1);
            }
            elements = newElements;
            front = 0;
            rear = size - 1;
        }

        @Override
        public String toString() {
            if (isEmpty()) {
                return "[]";
            }
            StringBuilder sb = new StringBuilder("[");
            if (front <= rear) {
                for (int i = front; i <= rear; i++) {
                    sb.append(elements[i]);
                    if (i < rear) sb.append(", ");
                }
            } else {
                for (int i = front; i < elements.length; i++) {
                    sb.append(elements[i]).append(", ");
                }
                for (int i = 0; i <= rear; i++) {
                    sb.append(elements[i]);
                    if (i < rear) sb.append(", ");
                }
            }
            sb.append("]");
            return sb.toString();
        }
    }
}