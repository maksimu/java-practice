package sorting;

import java.util.Arrays;

/**
 * Created by maksimustinov on 9/15/14.
 */
public class QuickSort {

    public int[] sort_Using_Java_ARRAY(int[] arr){
        Arrays.sort(arr);
        return arr;
    }

    int partition(int arr[], int left, int right) {
        int i = left;
        int j = right;
        int tmp;
        int pivot = arr[(left + right) / 2];

        while (i <= j) {

            while (arr[i] < pivot) {
                i++;
            }

            while (arr[j] > pivot) {
                j--;
            }

            if (i <= j) {
                tmp = arr[i];
                arr[i] = arr[j];
                arr[j] = tmp;
                i++;
                j--;
            }
        }


        return i;
    }

    public void quickSort(int arr[], int left, int right) {

        int index = partition(arr, left, right);

        if (left < index - 1)
            quickSort(arr, left, index - 1);

        if (index < right)
            quickSort(arr, index, right);
    }
}
