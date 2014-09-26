package coursera.algorithms.mergesort;

/**
 * Created by maksimustinov on 9/25/14.
 */
public class MergeSortImpl {


    public static void main(String... args){
        int[] aux = new int[10];
        int[] a = {0,1,2,3,4};
        int[] b = {5,6,7,8,9};

        for (int i : aux)
            System.out.print(i + " ");

        merge(aux, a, b);

        System.out.println("\n\n");
        for (int i : aux)
            System.out.print(i + " ");
    }





    /**
     * ARRAY HAS TO BE SORTED BEFORE MERGE
     * @param aux Merged array
     * @param a
     * @param b
     */
    public static void merge(int[] aux, int[] a, int[] b){

        int indexA = 0;
        int indexB = 0;
        int indexC = 0;


        while(indexA < a.length && indexB < b.length){

            if(a[indexA] < b[indexB]){
                aux[indexC] = a[indexA];
                indexA++;
            } else {
                aux[indexC] = b[indexB];
                indexB++;
            }

            indexC++;
        }

        // Do the clean up of what was not copied in the first half

        while(indexA < a.length){
            aux[indexC] = a[indexA];
            indexA++;
            indexC++;
        }

        while(indexB < b.length){
            aux[indexC] = b[indexB];
            indexB++;
            indexC++;
        }
    }
}
