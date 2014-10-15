package lru;

import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.Map;
import java.util.Queue;

/**
 * Created by maksimustinov on 10/8/14.
 */
public class LRU {


    Map<Integer, Integer> queue = new LinkedHashMap<Integer, Integer>();

    int maxSize = 0;

    public LRU(int maxSize){
        this.maxSize = maxSize;
    }

    public void addToQueue(String newStr){

        if(queue.size() == maxSize){

        }


//        queue.add(newStr);
    }
}
