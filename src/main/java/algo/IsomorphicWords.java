package algo;

import java.util.HashMap;

/**
 * Created by maksimustinov on 9/27/14.
 */
public class IsomorphicWords {

    public static void main(String[] args) {

        System.out.println("Is isomorphic: " + isIsomorphic("abc", "bcd"));

        System.out.println("\"foo\", \"app\" --> " + isIsomorphic_I("foo", "app"));
        System.out.println("\"bar\", \"foo\" --> " + isIsomorphic_I("bar", "foo"));
        System.out.println("\"turtle\", \"tletur\" --> " + isIsomorphic_I("turtle", "tletur"));
        System.out.println("\"ab\", \"ca\" --> " + isIsomorphic_I("ab", "ca"));

    }

    /**
     *  Given two (dictionary) words as Strings, determine if they are isomorphic.
     *  Two words are called isomorphic if the letters in one word can be remapped to get the second word.
     *  Remapping a letter means replacing all occurrences of it with another letter while the ordering of the
     *  letters remains unchanged. No two letters may map to the same letter, but a letter may map to itself.
     *
     *  Example:
     *      Given "foo", "app";         returns true we can map 'f' -> 'a' and 'o' -> 'p'
     *      Given "bar", "foo";         returns false we can't map both 'a' and 'r' to 'o'
     *      Given "turtle", "tletur";   returns true we can map 't' -> 't', 'u' -> 'l', 'r' -> 'e', 'l' -> 'u', 'e' -'r'
     *      Given "ab", "ca";           returns true we can map 'a' -> 'c', 'b'
     * @return
     */
    public static boolean isIsomorphic(String w1, String w2){

        if(w1 == null || w2 == null){
            return false;
        }

        if(w1.length() != w2.length()){
            return false;
        }

        if(w1.equals(w2)){
            return true;
        }

        HashMap<Character, Character> map1 = new HashMap<Character, Character>();

        for(int i = 0 ; i < w1.length(); i++){
            char c = w1.charAt(i);

            if(! map1.containsKey(c)){
//                map1.put(c,)
            }
        }

        return true;
    }

    public static boolean isIsomorphic_v1(String w1, String w2) {

        char[] w1Array = w1.toCharArray();
        char[] w2Array = w2.toCharArray();

        HashMap<Character, Integer> charCountMap = new HashMap<Character, Integer>();

        for (int i = 0; i < w1Array.length; i++) {

            char currChar = w1Array[i];

            if (charCountMap.containsKey(currChar)) {
                charCountMap.put(currChar, charCountMap.get(currChar) + 1);
            } else {
                charCountMap.put(currChar, 1);
            }
        }

        for (int j = 0; j < w2Array.length; j++) {
            char currChar = w2Array[j];

            if (charCountMap.containsKey(currChar)) {
                charCountMap.put(currChar, charCountMap.get(currChar) - 1);
            } else {
                charCountMap.put(currChar, 1);
            }
        }


        for (Object o : charCountMap.keySet().toArray()) {

            Character c = (Character) o;

            if (charCountMap.get(c) == 0) {
                charCountMap.remove(c);
            }
        }


        if (charCountMap.isEmpty()) {
            return true;
        } else {
            return false;
        }

    }


    /**
     * Given two words as Strings, determine if they are isomorphic. Two words are called isomorphic
     * if the letters in one word can be remapped to get the second word. Remapping a letter means replacing all
     * occurrences of it with another letter while the ordering of the letters remains unchanged. No two letters
     * may map to the same letter, but a letter may map to itself.
     *
     * Example:
     *   given "foo", "app"; returns true
     *     we can map 'f' -> 'a' and 'o' -> 'p'
     *
     *   given "foo", "boa"; returns false
     *     we can map 'f' -> 'b', 'o' -> 'o', we can't map 'o' -> 'a'
     *
     *   given "bar", "foo"; returns false
     *     we can't map both 'a' and 'r' to 'o'
     *
     *   given "turtle", "tletur"; returns true
     *     we can map 't' -> 't', 'u' -> 'l', 'r' -> 'e', 'l' -> 'u', 'e' ->'r'
     *
     *   given "ab", "ca"; returns true
     *     we can map 'a' -> 'c', 'b' -> 'a'
     */
    public static boolean isIsomorphic_I(String firstWord, String secondWord) {
        // implementation...

        if(firstWord == null || secondWord == null){
            return false;
        }

        if(firstWord.length() != secondWord.length()){
            return false;
        }

        if(firstWord.equals(secondWord)){
            return true;
        }


        HashMap<Character, Character> map1 = new HashMap<Character, Character>();
        HashMap<Character, Character> map2 = new HashMap<Character, Character>();


        for(int i = 0; i < firstWord.length(); i++){

            if(! map1.containsKey(firstWord.charAt(i))){
                map1.put(firstWord.charAt(i), secondWord.charAt(i));
            } else{
                if (! map1.get(firstWord.charAt(i)).equals(secondWord.charAt(i)))
                    return false;
            }


            if(! map2.containsKey(secondWord.charAt(i))){
                map2.put(secondWord.charAt(i), firstWord.charAt(i));
            } else{
                if (! map2.get(secondWord.charAt(i)).equals(firstWord.charAt(i)))
                    return false;
            }

        }

        return true;

    }
}
