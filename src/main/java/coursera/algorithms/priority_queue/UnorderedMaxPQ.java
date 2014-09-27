package coursera.algorithms.priority_queue;

import java.util.Comparator;

/**
 * Created by maksimustinov on 9/26/14.
 */
public class UnorderedMaxPQ<Key extends Comparator<Key>> {

    private Key[] pq;
    private int N;      // size of the queue

    public UnorderedMaxPQ(int size){
        this.N = size;
        pq = (Key[]) new Comparable[size];
    }

    public boolean isEmpty(){
        return N == 0;
    }

    public void insert(Key x){
        pq[N++] = x;
    }

    public Key delMax(){

        int max = 0;

        for(int i = 1; i < N; i++){
            if(max < i){
                max = i;
            }
        }

        return null;
    }

}
