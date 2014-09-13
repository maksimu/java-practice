package sorting;

/**
 * Created by maksimustinov on 9/1/14.
 */
public class Tester {


    public static void main(String... args){

        int[] array = {31, 41, 59, 26, 41, 58};

        /**
         * 31	41	59	26	41	58
         * 31	41	59	26	41	58	j = 1
         * 31	41	59	26	41	58	j = 2
         * 26	31	41	59	41	58	j = 3	k = 26	swapIndex = 2, 1, 0, -1
         * 26	31	41	41	59	58	j = 4	k = 41	swapIndex = 3, 2
         * 26	31	41	41	58	59	j = 5	k = 58	swapIndex = 4, 3,
         */

        Sort insertSort = new InsertionSort();

//        System.out.println("Before sort: " + arrayToString(array));
//        insertSort.sort(array);
//        System.out.println("After sort : " + arrayToString(array));

        
        InsertionSort2 insertSort2 = new InsertionSort2();
        System.out.println("Before sort: " + arrayToString(array));
        int[] sorted = insertSort2.insertSearch(array);
        System.out.println("After sort : " + arrayToString(sorted));

    }

    public static String arrayToString(int[] array){

        String out = new String();

        for(int i : array){
            out += i + ", ";
        }

        return out;
    }

}
