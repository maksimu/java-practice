package recursion;

/**
 * Created by maksimustinov on 9/7/14.
 */
public class RecursionDriver {

    public static void main(String... args){

        int factorialNum = 10;
        System.out.println("Recursion on " + factorialNum + "! = " + RecursionHelper.factorial_recursive(factorialNum));
        System.out.println("Iteration on " + factorialNum + "! = " + RecursionHelper.factorial_iterative(factorialNum));

        int[] arr = {1,2,3,4,5,6,7,8,9};

        System.out.println("====> binarySearch_recursive ");
        System.out.println("Found: " + RecursionHelper.binarySearch_recursive( arr, 3));

        System.out.println("====> binarySearch_iterative ");
        System.out.println("Found at index [" + RecursionHelper.binarySearch_iterative( arr, 30000) + "]");


    }
}
