package string;

/**
 * Created by maksimustinov on 9/6/14.
 */
public class SrtingDriver {

    public static void main(String ... args){

        System.out.println("--- REMOVE CHARS");
        String s = StringHelper.removeChars("aabcdeefg", "abcde");
        System.out.println(s);

        System.out.println("\n\n--- REVERSE WORDS (Java Utils)");
        String sentence = "One Two Three";
        String m0 = StringHelper.reverseWordJavaUtils(sentence);
        System.out.println("M0 Orig: " + sentence);
        System.out.println("M0 Rev : " + m0);

        System.out.println("\n\n--- REVERSE WORDS (Array Manipulation)");
        String m1 = StringHelper.recursiveWordInverse(sentence);
        System.out.println("M1 Orig: " + sentence);
        System.out.println("M1 Rev : " + m1);

        System.out.println("\n\n--- REVERSE WORDS (Array Manipulation + Recursion)");
        String m2 = StringHelper.reverseWordsArrayManip_WIHT_ALGORITHM(sentence);
        System.out.println("M2 Orig: " + sentence);
        System.out.println("M2 Rev : " + m2);


    }
}
