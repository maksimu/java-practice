package arrays;

/**
 * Created by maksimustinov on 9/3/14.
 */
public class AArray {

    int[] array;
    int numOfElements = 0;

    public AArray(int maxSize) {
        this.array = new int[maxSize];
    }

    public int get(int index) {
        return array[index];
    }


    public boolean insert(int val) {
        if (numOfElements == (array.length - 1)) {
            return false;
        } else {
            array[numOfElements++] = val;
            return true;
        }
    }

    public boolean insert2(int val) {

//        if(numOfElements == array.length -1){
//            return false; // can't add more because we reached max num of elements in the array
//        } else {
        array[numOfElements] = val;
        numOfElements++;
        return true;
//        }

    }


    /**
     * Performance: O(n) [from O(1) to O(n) to find, and O(1) to O(n)3
     *
     * @param key
     * @return
     */
    public boolean delete(int key) {

        int arrayIndex;

        for (arrayIndex = 0; arrayIndex < numOfElements; arrayIndex++) {
            if (key == array[arrayIndex]) {
                break;
            }
        }

        if (arrayIndex == numOfElements) {
            return false;
        } else {
            for (int k = arrayIndex; k < numOfElements; k++) {
                array[k] = array[k + 1];
            }

            numOfElements--;

            return true;
        }
    }


    /**
     * Linear search of array for key.  Returns index or -1 if not found.
     * The upperbound index is not included in the search.
     * This is to be consistent with the way Java in general expresses ranges.
     * This searches from low to high index values.
     * <p/>
     * More info: http://www.leepoint.net/notes-java/algorithms/searching/linearsearch.html
     * <p/>
     * The performance is O(N).
     *
     * @param key Value that is being looked for.
     * @return Returns index of the first match, or -1 if no match.
     */
    public int linearSearch(int key) {

        for (int i = 0; i < numOfElements; i++) {
            if (array[i] == key) {
                return i;
            }
        }

        return -1;
    }


    /**
     * Array has to be sorted
     * <p/>
     * More info: http://www.leepoint.net/notes-java/algorithms/searching/binarysearch.html
     *
     * @param target
     * @return
     */
    public int binarySearch(int target) {

        int firstIndex = 0;
        int endIndex = numOfElements - 1;
        int mid;

        while (firstIndex <= endIndex ) {

            mid = (firstIndex + endIndex) / 2;

            if (array[mid] == target) {
                return mid;
            } else if (array[mid] > target) { // target is lower then middle
                endIndex = mid - 1;     // mid should not be included, so decrease it
            } else {
                firstIndex = mid + 1;
            }
        }

        return -1;
    }




    /**
     * More info: http://www.leepoint.net/notes-java/algorithms/searching/rbinarysearch.html
     *
     * @param key
     * @return
     */
    public int recursiveBinarySearch(int key) {
        return -1;
    }


    public void sort() {

    }


    /**
     * Performance is O(n)
     *
     * @return
     */
    @Override
    public String toString() {
        String s = "";

        for (int i = 0; i < numOfElements; i++) {
            s += "[" + i + "->" + array[i] + "]";
        }

        return "Num. of items: " + numOfElements + ", Values: " + s;
    }
}
