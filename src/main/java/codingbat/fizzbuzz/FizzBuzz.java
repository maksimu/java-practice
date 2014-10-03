package codingbat.fizzbuzz;

/**
 * http://codingbat.com/doc/practice/fizzbuzz-code.html
 *
 * FizzBuzz Problem Statement

 Based on a traditional English children's game
    -   Print the numbers 1..100
    -   For multiples of 3, print "Fizz" instead of the number
    -   For multiples of 5, print "Buzz" instead of the number
    -   For multiples of 3 and 5, print "FizzBuzz" instead of the number
 Here: fill an array instead of printing + some other complications

 * Created by maksimustinov on 10/2/14.
 */
public class FizzBuzz {


    public static void main(String[] args){
        solve();
    }


    public static void solve(){

        String[] arr = new String[100];

        for(int i = 1; i <= 100; i++){

            boolean isMulOf_3 = i % 3 == 0;
            boolean isMulOf_5 = i % 5 == 0;

            String val;

            if(isMulOf_3 && isMulOf_5){
                val = "FizzBuzz";
            } else if( isMulOf_3 ){
                val = "Fizz";
            } else if( isMulOf_5 ) {
                val = "Buzz";
            } else {
                val = String.valueOf(i);
            }

            arr[i-1] = val;

            System.out.println("num " + i + "\t--> " + arr[i-1]);
        }
    }
}
