package coding_exercises;

import java.util.LinkedHashMap;
import java.util.Map;

/**
 * Implement a LRU (Least Recently Used) cache with limited size and fast look-up
 *
 * Problem statement: http://mcicpc.cs.atu.edu/archives/2012/mcpc2012/lru/lru.html
 * Solution example: http://mcicpc.cs.atu.edu/archives/2012/mcpc2012/lru/lru.java
 *
 * Other examples:
 *  - Using LinkedHashMap O(1) - http://www.codewalk.com/2012/04/least-recently-used-lru-cache-implementation-java.html
 *  -
 *
 * Created by maksimustinov on 9/24/14.
 */
public class LRUImpl {

    LRULinkedHashMap<String, String> cache;
    public LRUImpl(int cacheSize){

        cache = new LRULinkedHashMap<String, String>(cacheSize);
    }


    public String get(String key){
        return cache.get(key);
    }

    public void set(String key, String val){
        cache.put(key, val);
    }


    private class LRULinkedHashMap<K, V> extends LinkedHashMap<K, V>{

        int size;

        public LRULinkedHashMap(int size){
            super(size+1, 1.0f, true);
            this.size = size;
        }

        @Override
        protected boolean removeEldestEntry(Map.Entry entry){
            return (size() > this.size);
        }
    }



    public static void main(String... args){
        LRUImpl lru = new LRUImpl(5);
        lru.set("1", "1");
        lru.set("2", "2");
        lru.set("3", "3");
        lru.set("4", "4");
        lru.set("5", "5");
        lru.set("11", "11");

        System.out.println(lru.get("1"));
    }
}
