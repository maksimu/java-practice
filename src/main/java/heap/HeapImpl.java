package heap;

import java.util.ArrayList;

/**
 * Created by maksimustinov on 10/13/14.
 */
public class HeapImpl {

    public ArrayList<Integer> heap = new ArrayList<Integer>();


    // [1]

    public void insert(Integer val){
        System.out.println("Before insert   : " + p(heap));
        heap.add(val);
        System.out.println("After insert    : " + p(heap));
        siftUp();
        System.out.println("After siftup    : " + p(heap));
    }


    public void delete(int indexToRemove){
        System.out.println("Before delete   : " + p(heap));
        heap.set(indexToRemove, heap.get(heap.size()-1));
        heap.remove(heap.size()-1);
        System.out.println("After delete    : " + p(heap));
        siftDown();
        System.out.println("After siftdown  : " + p(heap));
    }


    private void siftUp(){

        int k = heap.size()-1;


        while (k >= 0){

            int p = indexParent(k);

            if(heap.get(k) > heap.get(p)){

                Integer temp = heap.get(p);
                heap.set(p, heap.get(k));
                heap.set(k, temp);

                k = p;
            } else{
                break;
            }
        }
    }

    private void siftDown() {
        int k = 0;
        int l = indexLeft(k);

        while (l < heap.size()) {
            int max=l;
            int r=l+1;

            // Compare which child is bigger.
            // Side ways comparison
            if (r < heap.size()) { // there is a right child
                if (heap.get(r).compareTo(heap.get(l)) > 0) {
                    max++;
                }
            }

            // compare root with the MAX child
            Integer parent = heap.get(k);
            Integer maxChild = heap.get(max);

            // if max child is bigger then we swap parent with the child
            if (parent.compareTo(maxChild) < 0) {
                // switch
                Integer temp = heap.get(k);
                heap.set(k, heap.get(max));
                heap.set(max, temp);
                k = max;
                l = indexLeft(k);
            } else {
                break;
            }
        }
    }


    /**
     *
     *
     * 2n + 1
     *
     * @param parentIndex
     * @return
     */
    public int indexLeft(int parentIndex){
        return 2 * parentIndex + 1;
    }

    public int indexRight(int parentIndex){
        return 2 * parentIndex + 2;
    }

    public int indexParent(int childIndex){
        return (childIndex - 1)/2;
    }


    public static String p(ArrayList<Integer> arrayList){

        int inx = 0;

        StringBuilder sb = new StringBuilder();

        for(Integer i : arrayList){
            sb.append(inx++).append("[" + i + "] ");
        }

        return sb.toString();
    }
}
