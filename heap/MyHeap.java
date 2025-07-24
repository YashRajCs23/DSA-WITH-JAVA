public class MyHeap {
    int heapSize;    // Current size of the heap
    int[] heap;      // Array to represent the heap
    int capacity;    // Maximum capacity of the heap

    // Constructor to initialize heap from input array
    MyHeap(int[] arr) {
        heap = arr;
        heapSize = arr.length;
        capacity = arr.length;
    }

    // Doubles the capacity of heap when full
    public void increaseCapacity() {
        capacity *= 2;
        int[] newHeap = new int[capacity];
        for (int i = 0; i < heapSize; i++) {
            newHeap[i] = heap[i];
        }
        heap = newHeap;
    }

    // Swap two elements in the heap
    public void swap(int i, int j) {
        int temp = heap[i];
        heap[i] = heap[j];
        heap[j] = temp;
    }

    // Maintain heap property (heapify subtree rooted at index)
    public void heapify(int index) {
        int largest = index;
        int left = 2 * index + 1;
        int right = 2 * index + 2;

        if (left < heapSize && heap[left] > heap[largest]) {
            largest = left;
        }
        if (right < heapSize && heap[right] > heap[largest]) {
            largest = right;
        }
        if (largest != index) {
            swap(index, largest);
            heapify(largest); // recursively heapify the affected subtree
        }
    }

    // Build a max-heap from the current heap array
    public void buildTree() {
        for (int i = heapSize / 2 - 1; i >= 0; i--) {
            heapify(i);
        }
    }

    // Print current heap
    public void printTree() {
        for (int i = 0; i < heapSize; i++) {
            System.out.print(heap[i] + " ");
        }
        System.out.println();
    }

    // Remove and return the maximum element (root)
    public int extractMax() {
        if (heapSize == 0) return -1;
        int max = heap[0];
        heap[0] = heap[heapSize - 1];
        heapSize--;
        heapify(0);
        return max;
    }

    // Extract max and store it at the end for sorting
    public void extractMaxAndStore() {
        if (heapSize == 0) return;
        int max = heap[0];
        heap[0] = heap[heapSize - 1];
        heap[heapSize - 1] = max;
        heapSize--;
        heapify(0);
    }

    // Increase the value at index to a new higher value
    public void increaseKey(int index, int newValue) {
        if (index < 0 || index >= heapSize || heap[index] >= newValue) return;
        heap[index] = newValue;
        while (index > 0 && heap[index] > heap[(index - 1) / 2]) {
            swap(index, (index - 1) / 2);
            index = (index - 1) / 2;
        }
    }

    // Decrease the value at index to a new lower value
    public void decreaseKey(int index, int newValue) {
        if (index < 0 || index >= heapSize || heap[index] <= newValue) return;
        heap[index] = newValue;
        heapify(index);
    }

    // Insert a new value into the heap
    public void insert(int newValue) {
        if (heapSize >= capacity) increaseCapacity();
        heapSize++;
        heap[heapSize - 1] = newValue;
        int index = heapSize - 1;

        // Fix heap property going up
        while (index > 0 && heap[index] > heap[(index - 1) / 2]) {
            swap(index, (index - 1) / 2);
            index = (index - 1) / 2;
        }
    }

    // Heap Sort: Sorts the array in increasing order (in-place)
    public int[] heapSort() {
        buildTree();
        int size = heapSize;
        for (int i = 0; i < size; i++) {
            extractMaxAndStore();
        }
        heapSize = size; // Restore original size
        return heap;
    }

    // Main method for testing
    public static void main(String[] args) {
        int[] arr = new int[] { 10, 5, 20, 6, 11 };
        MyHeap heap = new MyHeap(arr);

        System.out.println("Initial heap:");
        heap.buildTree();
        heap.printTree();

        System.out.println("After extracting max:");
        heap.extractMax();
        heap.printTree();

        System.out.println("Inserting 25:");
        heap.insert(25);
        heap.printTree();

        System.out.println("Heap Sort:");
        heap.heapSort();
        heap.printTree();
    }
}