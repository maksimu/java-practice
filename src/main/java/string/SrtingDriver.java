package string;

/**
 * Created by maksimustinov on 9/6/14.
 */
public class SrtingDriver {

    public static void main(String ... args){

        System.out.println("--- REMOVE CHARS");
        String s = StringHelper.removeChars("aabcdeefg", "abcde");
        System.out.println(s);

        System.out.println("\n\n--- REVERSE WORDS");
        String sentence = "All files are up-to-date";
        String m0 = StringHelper.reverseWordM0(sentence);
        System.out.println("M0 Orig: " + sentence);
        System.out.println("M0 Rev : " + m0);

        System.out.println("\n\n--- REVERSE LETTERS IN A WORD");
        String revWord = StringHelper.reverseWord("Maksim");
        System.out.println("REV: " + revWord);

    }
}
