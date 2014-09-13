package sorting;

/**
 * Created by maksimustinov on 9/9/14.
 */
public class InsertionSort2 {


    public int[] insertSearch(int[] unsortedArray){

        for(int i = 0; i < unsortedArray.length; i++){

            int nextMinIndex = findMinIndex(unsortedArray, i);
            swap(unsortedArray, i, nextMinIndex);
        }

        return unsortedArray;
    }

    private void swap(int[] arr, int val1, int val2){
        int tempVal = arr[val2];

        arr[val2] = arr[val1];
        arr[val1] = tempVal;
    }

    private int findMinIndex(int[] arr, int startIndex){
        int currMinIndex = startIndex;

        for(int i = startIndex; i < arr.length; i++){
            if(arr[currMinIndex] >= arr[i]){
                currMinIndex = i;
            }
        }

        return currMinIndex;
    }
}
