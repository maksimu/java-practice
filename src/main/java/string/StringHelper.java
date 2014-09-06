package string;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by maksimustinov on 9/6/14.
 */
public class StringHelper {


    /**
     * Find the First Nonrepeated Character
     *
     * PROBLEM Write an efficient function to find the first nonrepeated character in a string. For instance, the first
     * nonrepeated character in “total” is 'o' and the first nonrepeated character in “teeter” is 'r'. Discuss the
     * efficiency of your algorithm.
     *
     * Excerpt From: Noah Kindler. “Programming Interviews Exposed.” iBooks. https://itunes.apple.com/WebObjects/MZStore.woa/wa/viewBook?id=454DDAD36D7B5156322885BEAE13B948
     *
     * Performance: O(2n)
     */
    public static Character findFirstNonrepeatedCharacter(String s){

        Map<Character, Integer> charMap = new HashMap<Character, Integer>();

        int stringLenght = s.length();


        for(int i = 0; i < stringLenght; i++){
            char currentChar = s.charAt(i);

            if(charMap.containsKey(currentChar)) {
                charMap.put(currentChar, charMap.get(currentChar) + 1);
            } else {
                charMap.put(currentChar, 1);
            }
        }

        for(int j = 0; j < stringLenght; j++){
            char currentChar = s.charAt(j);

            if(charMap.get(currentChar) == 1){
                return currentChar;
            }
        }

        return null;
    }

    /**
     * Remove Specified Characters
     *
     * PROBLEM Write an efficient function that deletes characters from an ASCII string. Use the prototype
     *
     *      string removeChars( string str, string remove );
     *
     * where any character existing in remove must be deleted from str.
     * For example, given a str of "Battle of the Vowels: Hawaii vs. Grozny" and a remove of "aeiou", the
     * function should transform str to “Bttl f th Vwls: Hw vs. Grzny”. Justify any design decisions you make,
     * and discuss the efficiency of your solution.
     *
     * Excerpt From: Noah Kindler. “Programming Interviews Exposed.” iBooks. https://itunes.apple.com/WebObjects/MZStore.woa/wa/viewBook?id=454DDAD36D7B5156322885BEAE13B948
     *
     * @param text
     * @param charsToRemove
     */
    public static String removeChars(String text, String charsToRemove){

        char[] textArr = text.toCharArray();
        char[] charsToRemoveArr = charsToRemove.toCharArray();

        int source = 0;
        int destination = 0;

        // init flags for ASCII chars. there 128 ASCII chars
        boolean[] asciiFlags = new boolean[128];

        // set flags for chars to be removed
        for(source = 0; source < charsToRemove.length(); source++){
            int asciiNum = charsToRemoveArr[source];

            asciiFlags[asciiNum] = true;
        }


        for(source = 0; source < textArr.length; source++){

            int textCharNum = textArr[source];
            boolean toReplace = !asciiFlags[textCharNum];
            if( toReplace ){

                System.out.println("textArr[destination++] = " + textArr[destination] + " --> textArr[source]        = " + textArr[source]);
                textArr[destination] = textArr[source];

                destination++;
            }
        }


        // String(
        //          [give a full text array],
        //          [start removing from zero],
        //          [end removing at the last position of the inserted character]
        //       )
        return new String(
                textArr,
                0,
                destination);

    }


    /**
     * Reverse Words
     *
     * PROBLEM Write a function that reverses the order of the words in a string. For example, your function should
     * transform the string "Do or do not, there is no try." to "try. no is there not, do or Do". Assume that all words
     * are space delimited and treat punctuation the same as letters.
     *
     * Excerpt From: Noah Kindler. “Programming Interviews Exposed.” iBooks. https://itunes.apple.com/WebObjects/MZStore.woa/wa/viewBook?id=454DDAD36D7B5156322885BEAE13B948
     *
     * @param s Sentence to reverse
     * @return
     */

    public static String reverseWordM0(String s){

        String[] sArr = s.split("\\b");

        StringBuilder sb = new StringBuilder();

        for(int i = sArr.length -1; i >= 0; i--){
            sb.append(sArr[i]);
        }

        return sb.toString();
    }

    public static String reverseWordsM1(String s){

        char[] sentence = s.toCharArray();

        int wordBeginPosition = 0;

        for(int i = sentence.length-1; i >= 0; i--){

            if(sentence[i] != ' '){
            }



            System.out.print("[" + sentence[i] + "]");
        }


        return null;
    }




    public static String reverseWord(String w){
        char[] word = w.toCharArray();
        char[] drow = new char[word.length];

        int lastIndex = word.length-1;

        for(int i = lastIndex; i >= 0; i--){
            drow[lastIndex-i] = word[i];
        }

        return new String(drow);
    }

}
