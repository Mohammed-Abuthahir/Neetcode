// LRU Cache
import java.util.*;
import java.util.Scanner;
import java.util.Arrays;
class designLRUCache{
    public static void main(String[] args){
        LRUCache LRUCache = new LRUCache(2);
        LRUCache.put(1,1);
        LRUCache.put(2,2);
        System.out.println(LRUCache.get(2));
        LRUCache.put(3,3);
        System.out.println(LRUCache.get(1));
        LRUCache.put(4,4);
        System.out.println(LRUCache.get(1));
        System.out.println(LRUCache.get(3));
        System.out.println(LRUCache.get(4));
    }
}

class LRUCache{
    LinkedHashMap<Integer, Integer> map;
    int capacity = 0;
    public LRUCache(int capacity){
        this.map = new LinkedHashMap<>(capacity, 0.75f, true);
        this.capacity = capacity;
    }

    public int get(int key){
        return map.getOrDefault(key, -1);
    }

    public void put(int key, int value){
        map.put(key, value);
        if(map.size() > capacity){
            int oldestKey = map.keySet().iterator().next();
            map.remove(oldestKey);
        }
    }
}