package coursera.algorithms.sorting;

import helper.Util;

/**
 * Created by maksimustinov on 9/20/14.
 */

public class Data implements Comparable<Data> {

    private Long id;
    private String name;

    public Data() {

    }

    public Data(Long id, String name) {
        this.id = id;
        this.name = name;
    }

    public static Data[] getArray(Data... datas) {
        return datas;
    }

    /**
     * -  -1 less
     * -  +1 more
     * -   0 equal
     *
     * @param data
     * @return
     */
    public int compareTo(Data data) {
        if (this.getId() > data.getId()) {
            return +1;
        } else if (this.getId() < data.getId()) {
            return -1;
        } else {
            return 0;
        }
    }


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


    public static void selectionSort(Data[] unsortedArr) {

        int N = unsortedArr.length;

        for (int i = 0; i < N; i++) {

            Data minData = unsortedArr[i];

            for (int j = i + 1; j < N; j++) {
                if (minData.compareTo(unsortedArr[j]) > 0) {
                    SortAlgorithms.swap(unsortedArr, i, j);
                }
            }
        }
    }

    /**
     * Inefficiency: elements move only one position at a time
     * <p/>
     * Best case: If the array is in ascending order, insertion sort makes N-1 compares and 0 exchanges. linear instead of being quadratic
     * Worst case: if the array is in descending order (and no duplicates) insertion sort makes ~1/2 N^2 compares and ~1/2 N^2 exchanges
     * <p/>
     * This sorting is good for partially sorted arrays.
     *
     * @param a
     */
    public static void insertionSort(Data[] a) {

        int N = a.length;

        for (int i = 0; i < N; i++) {
            for (int j = i; j > 0; j--) {
                Data next = a[j];
                Data prev = a[j - 1];

                if (next.compareTo(prev) < 0) {
                    SortAlgorithms.swap(a, j, j - 1);
                } else {
                    break;
                }
            }
        }
    }

    private static boolean less(Comparable v, Comparable w) {
        return v.compareTo(w) < 0;
    }

    /**
     * Idea: Mode entries more than one position at a time by h-sorting the array
     *
     * @param a
     */
    public static void shellSort(Data[] a) {

        int N = a.length;
        int h = 1;

        while (h < N / 3)
            h = 3 * h + 1;

        while (h >= 1) {
            for (int i = h; i < N; i++) {
                for (int j = i; j >= h && less(a[j], a[j - h]); j = h) {
                    Data next = a[j];
                    Data prev = a[j - 1];

                    if (next.compareTo(prev) < 0) {
                        SortAlgorithms.swap(a, j, j - h);
                    } else {
                        break;
                    }
                }
            }

            h = h / 3;
        }
    }

    /**
     * Knoth shuffle
     * performance: O(N) - Linear time
     *
     * Algorithm -  1. In iteration i, pick integer r between 0 and i uniformly at random
     *              2. Swap a[i] and a[r]
     *
     * Performance - O(N logN)
     * @param a
     */
    public static void shuffle(Object[] a){

        int N = a.length;

        for(int i = 1; i < N ; i++){ // start from the second element
            int r = Util.randInt(0, i);
            SortAlgorithms.swap(a, i, r);
        }
    }


    /**
     * Convex hull
     *
     * The convex hull of a set of N points is the smallest perimeter fence enclosing the points
     *
     * Algorithm:
     * Graham Scan:
     * - Choose point p with smallest y-coordinate
     * - Sort points by polar angle with p
     * - Consider points in order; discard unless it create a ccw turn
     */


}



