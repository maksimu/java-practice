package sorting;

/**
 * Created by maksimustinov on 9/1/14.
 */
public class InsertionSort implements Sort {

    public void sort(int[] a){

        // start looping from the second element in the array to the end
        for(int j = 1; j < a.length; j++){

            int swapIndex = j - 1;

            while(swapIndex >= 0 && a[swapIndex] > a[j]){
                a[swapIndex+1] = a[swapIndex];              // move value from [swapIndex] to [swapIndex+1]
                swapIndex--;                                // decrease swap index to go down
            }

            a[swapIndex + 1] = a[j];
        }
    }
}
