package algo;

import java.util.HashMap;

/**
 * Created by maksimustinov on 9/27/14.
 */
public class IsomorphicWords {

    public static void main(String[] args) {

        System.out.println("Is isomorphic: " + isIsomorphic("one", "neo"));


    }


    public static boolean isIsomorphic(String w1, String w2) {

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
}
