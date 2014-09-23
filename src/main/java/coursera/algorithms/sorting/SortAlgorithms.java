package coursera.algorithms.sorting;

import java.util.Objects;

/**
 * Created by maksimustinov on 9/20/14.
 */
public class SortAlgorithms {






    public static void swap(Object[] objs, int i, int j){

        Object objI = objs[i];
        objs[i] = objs[j];
        objs[j] = objI;
    }


    public static void sort(Comparable[] arrayToStor){

        int N = arrayToStor.length;

        for(int i = 0; i < N; i++){
            for(int j = i; j > 0; j--){
                int comp = arrayToStor[j].compareTo(arrayToStor[j-1]);
                if(comp < 0){
                    swap(arrayToStor, j, j-1);
                } else {
                    break;
                }
            }
        }
    }



}
