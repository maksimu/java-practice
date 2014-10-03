package recursion;

import java.math.BigInteger;

/**
 * Created by maksimustinov on 9/29/14.
 */
public class FibonacciNonRecursion {

    public static void main(String[] args){


        fib(1000);

    }


    /**
     *
     *
     * 1, 1, 2, 3, 5, 8, 13, 21, 34, 55
     * @param n
     */
    public static String fib(int n){

        BigInteger prevNum = BigInteger.ZERO;

        BigInteger fibonacci = BigInteger.ZERO;

        for(int i = 1; i <= n; i++) {

            if (i < 3) {
                fibonacci = BigInteger.valueOf(1L);
            } else {

                BigInteger newFib = prevNum.add(fibonacci);
                prevNum = fibonacci;
                System.out.println(i + ") " + prevNum + " + " + fibonacci + " = " + newFib);

                fibonacci = newFib;
            }
        }

        return fibonacci.toString();
    }
}
