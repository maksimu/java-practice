package sorting;

/**
 * Created by maksimustinov on 9/1/14.
 */
public class MergeSort implements Sort{
    @Override
    public void sort(int[] a) {

    }


    private void merge (int[] A, int p, int q, int r){
        int n1 = q - p + 1;
        int n2 = r - q;

        int[] L = new int[n1 + 1];
        int[] R = new int[n2 + 1];

        for(int i = 1; i < n1; i++){
            L[i] = A[p + i - 1];
        }

        for(int j = 1; j < n2; j++){
            R[j] = A[q + j];
        }
    }
}
