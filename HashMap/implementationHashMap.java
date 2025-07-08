public class ImplementationHashMap<K, V> {
    private static final int DEFAULT_CAPACITY = 16;
    private static final float LOAD_FACTOR = 0.75f;
    private Node<K, V>[] table;
    private int size;   
    private static class Node<K, V> {
        final K key;
        V value;
        Node<K, V> next;
        Node(K key, V value, Node<K, V> next) {
            this.key = key;
            this.value = value;
            this.next = next;
        }
    }   
    public ImplementationHashMap() {
        table = (Node<K, V>[]) new Node[DEFAULT_CAPACITY];
        size = 0;
    }   
    public void put(K key, V value) {
        if (key == null) return;
        int index = getIndex(key);
        Node<K, V> head = table[index];
        Node<K, V> current = head;
        while (current != null) {
            if (current.key.equals(key)) {
                current.value = value;
                return;
            }
            current = current.next;
        }
        Node<K, V> newNode = new Node<>(key, value, head);
        table[index] = newNode;
        size++;
        if ((float)size / table.length > LOAD_FACTOR) resize();
    }   
    public V get(K key) {
        if (key == null) return null;
        int index = getIndex(key);
        Node<K, V> current = table[index];
        while (current != null) {
            if (current.key.equals(key)) return current.value;
            current = current.next;
        }
        return null;
    }   
    public V remove(K key) {
        if (key == null) return null;
        int index = getIndex(key);
        Node<K, V> current = table[index];
        Node<K, V> prev = null;
        while (current != null) {
            if (current.key.equals(key)) {
                if (prev == null) table[index] = current.next;
                else prev.next = current.next;
                size--;
                return current.value;
            }
            prev = current;
            current = current.next;
        }
        return null;
    }   
    public int size() {
        return size;
    }    
    private int getIndex(K key) {
        return key.hashCode() & (table.length - 1);
    }   
    private void resize() {
        Node<K, V>[] oldTable = table;
        table = (Node<K, V>[]) new Node[oldTable.length * 2];
        size = 0;
        for (Node<K, V> head : oldTable) {
            Node<K, V> current = head;
            while (current != null) {
                put(current.key, current.value);
                current = current.next;
            }
        }
    }   
    public static void main(String[] args) {
        ImplementationHashMap<String, Integer> map = new ImplementationHashMap<>();
        map.put("one", 1);
        map.put("two", 2);
        map.put("three", 3);
        System.out.println("Value for 'two': " + map.get("two"));
        System.out.println("Value for 'four': " + map.get("four"));
        System.out.println("Size: " + map.size());
        System.out.println("Removed: " + map.remove("two"));
        System.out.println("Size after removal: " + map.size());
    }
}