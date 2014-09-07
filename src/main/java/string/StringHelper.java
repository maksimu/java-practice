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


    /*
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

    /**
     * Reverse sentence using Java Utils API
     * @param s
     * @return
     */
    public static String reverseWordJavaUtils(String s){

        String[] sArr = s.split("\\b");

        StringBuilder sb = new StringBuilder();

        for(int i = sArr.length -1; i >= 0; i--){
            sb.append(sArr[i]);
        }

        return sb.toString();
    }

    /**
     * Reverse sentence using low lever Java code (arrays) -
     *
     * Complexity: O(M*N*K) TODO Improve to O(M*N)
     * @param s
     * @return
     */
    public static String reverseWordsArrayManip_NO_ALGORIGHTM(String s){

        char[] sentence = s.toCharArray();
        char[] ecnetnes = new char[sentence.length];
        int ecnetnesCursor = 0;
        int lenght = sentence.length;

        int wordBeginIndex;
        int wordEndIndex = lenght-1;

        for(int invIndex = lenght-1; invIndex >= 0; invIndex--){

            if(sentence[invIndex] == ' ' || invIndex == 0){
                // TODO Replace with the if-else shortcut
                if(invIndex == 0)                                          // we are at the beginning of the array, so there is no space in front.
                    wordBeginIndex = invIndex;
                else
                    wordBeginIndex = invIndex + 1;                          // we are at the space, adding one to the beginning of the word

                int thisWordSize = (wordEndIndex - wordBeginIndex) + 1;     // endIndex - beginIndex will be always one less then the size. That's why +1
                char[] temp = new char[thisWordSize];                       // TODO Figure out how to eliminate this

                for(int ss = 0; ss < thisWordSize; ss++){
                    temp[ss] = sentence[wordBeginIndex+ss];
                }

                int tempSizeCount = 0;

                while(tempSizeCount < thisWordSize){                        // copy current word to ecnetnes array
                    ecnetnes[ecnetnesCursor++] = temp[tempSizeCount];
                    tempSizeCount++;
                }
                wordEndIndex = invIndex - 1;
            }
        }

        return new String (ecnetnes);
    }





    public static String recursiveWordInverse(String str) {
        char charArray[] = str.toCharArray();

        for (int i = 0; i < charArray.length; i++) {
            if (charArray[i] == ' ') {
                return recursiveWordInverse(str.substring(i + 1)) + str.substring(0, i) + " ";

            }
        }
        return str + " ";
    }


    /**
     * Not finished. Here I tried to elimnate temp variable.
     * Now here "//   txet[curPosition] = " I need to try to swap letters from the end of the letter and beginning and navigate towards the center

     * @param s
     * @return
     */
    public static String reverseWordsArrayManip_WIHT_ALGORITHM(String s){

        char[] txet = reverseWord(s.toCharArray());

        int end = 0;
        int length = txet.length;

        while (end < length){
            if(txet[end] == ' '){

                int startIndex = length - (length - end);
                int endIndex = end-1;
                int numOfLetters = end-startIndex+1;

                int curPosition = startIndex;
                while(curPosition <= endIndex){
//                    txet[curPosition] =
                }
            }

            end++;
        }

        return null;
    }


    public static char[] reverseWord(char[] text){
        char[] txet = new char[text.length];

        int lastIndex = text.length-1;

        for(int i = lastIndex; i >= 0; i--){
            txet[lastIndex-i] = text[i];
        }

        return txet;
    }

}