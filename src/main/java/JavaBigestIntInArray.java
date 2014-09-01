/**
 * Created by maksimustinov on 8/30/14.
 */
public class JavaBigestIntInArray {

    public static void main(String... args) {

        int[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 12, 13, 23, 34, 23, 12, 34, 46, 5, 23, 23, 4, 6, 33};

        System.out.println("compareToMax: " + compareToMax(array));
        System.out.println("compareToAll: " + compareToAll(array));

    }

    static int compareToMax(int[] array) {
        int maxVal = 0;

        for (int i : array)
            maxVal = i > maxVal ? i : maxVal;

        return maxVal;
    }

    /* Returns the largest value in an array of non-negative integers */
    static int compareToAll(int array[]) {
        int i, j;
        boolean isMax;
        int n = array.length;

        /* Make sure that there is at least one element in the array. */
        if (n <= 0)
            return -1;

        for (i = n - 1; i > 0; i--) {
            isMax = true;
            for (j = 0; j < n; j++) {
            /* See if any value is greater. */
                if (array[j] > array[i]) {
                    isMax = false; /* array[i] is not the largest value. */
                    break;
                }
            }

        /* If isMax is true, no larger value exists; array[i] is max. */
            if (isMax) break;
        }

        return array[i];
    }

}
