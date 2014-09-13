package recursion;

/**
 * Created by maksimustinov on 9/7/14.
 */
public class RecursionHelper {

    public static int factorial_recursive(int n){
        if(n > 0){
            return n * factorial_recursive(n - 1);
        } else {
            return 1;
        }
    }

    public static int factorial_iterative(int n){

        int sum = 1;
        for(int i = n; i > 1; i--){
            sum = sum * i;
        }

        return sum;
    }

    public static int binarySearch_recursive(int[] data, int key){

        int val = bs_rec(data, key, 0, data.length-1);

        return val;
    }

    private static int bs_rec(int[] data, int key, int lower, int upper ){

        int range = (upper - lower);
        int center = (range / 2) + lower;

        if( range < 0){
            return -1;
        } else if (range == 0 && data[lower] != key){
            return -2;
        }


        if(data[center] == key)
            return key;

        else if(data[center] > key)
            return bs_rec(data, key, lower, center-1);

        else                                            // for (data[center] < key)
            return bs_rec(data, key, center+1, upper);

    }


    /**
     *
     * @param data
     * @param key
     * @return found index
     */
    public static int binarySearch_iterative (int[] data, int key){

        int lowerBound = 0;
        int upperBound = data.length-1;


        while(true){

            int range = upperBound - lowerBound + 1;
            int center = (range / 2) + lowerBound;


            if(range < 0){
                return -1; // not found
            } else if(range == 0 && data[lowerBound] != key){
                return -2;
            }


            else if(data[center] > key){
                upperBound = center+1;
            } else {
                lowerBound = center-1;
            }
        }

    }
}
