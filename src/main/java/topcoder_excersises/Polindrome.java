package topcoder_excersises;

/**
 * Created by maksimustinov on 9/26/14.
 *
 * A palindrome is a number that is the same whether it is read from left-to-right or right-to-left.
 * For example, 121 and 34543 are both palindromes. It turns out that nearly every integer can
 * be transformed into a palindrome
 *
 *  (1) by reversing its digits and adding it to the original number. If that does not create a palindrome,
 *  (2) add the reverse of the new number to itself.
 *  A palindrome is created by repeating the process of reversing the number and adding it to itself until the
 * number is a palindrome.
 *
 * Create a class Transform that contains the method palindrome, which takes a number N that is
 * to be transformed and returns a number that is the resultant palindrome from this process.
 * Of course if N is already a palindrome, return it without changing it. Though it is theorized
 * that all numbers can be transformed to palindromes in this way, some numbers do not converge
 * in a reasonable amount of time. For instance, 196 has been carried out to 26,000 digits without
 * finding a palindrome. So if the method finds that the resultant palindrome must be greater
 * than 1,000,000,000, return the special value -1 instead.
 *
 * DEFINITION
 * Class: Transform
 * Method: palindrome
 * Parameters: int
 * Returns: int
 * Method signature (be sure your method is public): int palindrome(int N);
 *
 * NOTES
 * - Leading zeroes are never considered part of a number when it is reversed. For instance,
 * 12's reverse will always be 21 regardless of whether it is represented as 12, 012, or 0012.
 * Examples with leading zeroes use the leading zeroes for clarity only.
 *
 * TopCoder will ensure the validity of the inputs. Inputs are valid if all of the following criteria are met:
 * - N will be between 1 and 10000 inclusive.
 *
 * EXAMPLES
 * Worked examples:
 * Example 1: N = 28
 * 28 + 82 = 110
 * 110 + 011 = 121, a palindrome. Return 121
 *
 * Example 2: N = 51
 * 51 + 15 = 66, a palindrome. Return 66
 *
 * Further examples:
 * Example 3: N = 11, return 11
 * Example 4: N = 607, return 4444
 * Example 5: N = 196, return -1


 */
public class Polindrome {

    static class Transform{



        public int palindrome(int N){

            int rN = reverseDigits(N);


            while (!isPalindrome(N)) {

                int oldN = N;
                N = oldN + rN;
                rN = reverseDigits(N);

                System.out.println(oldN + "+" + rN + "=" + N + "\t(not a palindrome)");


                if(N > 1000000000){

                    System.err.println("[" + N + "] is not a palindrome");
                    return -1;
                }
            }

            return N;
        }


        private int reverseDigits(int N){
            char[] chars = String.valueOf(N).toCharArray();

            int mid = (0 + chars.length) >>> 1;
            for(int i = 0; i < mid; i++){

                char temp = chars[i];
                chars[i] = chars[(chars.length-1)-i];
                chars[(chars.length-1)-i]=temp;
            }

            // Casting to long to avoid MAX_INT.
            // Value might rich up to 6,952,014,971 where as int only holds 2,147,483,647
            Long revN = Long.parseLong(new String(chars));

            return revN.intValue();
        }

        private boolean isPalindrome(int N){

            char[] chars = String.valueOf(N).toCharArray();

            int length = chars.length;
            int mid = (0 + length) >>> 1; // source http://googleresearch.blogspot.com/2006/06/extra-extra-read-all-about-it-nearly.html

            for(int i = 0; i < mid; i++){
                char a = chars[i];
                char b = chars[(chars.length-1)-i];

//                System.out.println(chars[i]);

                if(a != b){
                    return false;
                }
            }

            return true;
        }

    }


    public static void main(String args[]){


        Transform transform = new Transform();
//        System.out.println("Is a palindrome: " + transform.isPalindrome(1001));
//        System.out.println("Reverse digit  : " + transform.reverseDigits(987));
        System.out.println("RESULT --> " + transform.palindrome(1267));
    }

}
