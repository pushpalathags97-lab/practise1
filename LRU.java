import java.util.*;

public class LRU {
    private int capacity;
    private LinkedHashMap<Integer, Integer> cache;

    public LRU(int capacity) {
        this.capacity = capacity;

        cache = new LinkedHashMap<>(capacity, 0.75f, true) {
            protected boolean removeEldestEntry(
                    Map.Entry<Integer, Integer> eldest) {
                return size() > capacity;
            }
        };
    }

    public int get(int key) {
        if (cache.containsKey(key))
            return cache.get(key);
        return -1;
    }

    public void put(int key, int value) {
        cache.put(key, value);
    }

    public static void main(String[] args) {
        LRU lru = new LRU(2);

        lru.put(1, 1);
        lru.put(2, 2);
        System.out.println(lru.get(1));
        lru.put(3, 3);
        System.out.println(lru.get(2));
        lru.put(4, 4);
        System.out.println(lru.get(1));
        System.out.println(lru.get(3));
        System.out.println(lru.get(4));
    }
}
