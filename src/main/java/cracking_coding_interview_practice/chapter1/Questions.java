package cracking_coding_interview_practice.chapter1;

import sun.reflect.generics.reflectiveObjects.NotImplementedException;

import java.util.*;

/**
 * Questions on page # 48
 *
 * Created by maksimustinov on 10/16/14.
 *
 *
 * ASCII Table

 Dec  = Decimal Value
 Char = Character

 '5' has the int value 53
 if we write '5'-'0' it evaluates to 53-48, or the int 5
 if we write char c = 'B'+32; then c stores 'b'


 Dec  Char                           Dec  Char     Dec  Char     Dec  Char
 ---------                           ---------     ---------     ----------
 0  NUL (null)                       32  SPACE     64  @         96  `
 1  SOH (start of heading)           33  !         65  A         97  a
 2  STX (start of text)              34  "         66  B         98  b
 3  ETX (end of text)                35  #         67  C         99  c
 4  EOT (end of transmission)        36  $         68  D        100  d
 5  ENQ (enquiry)                    37  %         69  E        101  e
 6  ACK (acknowledge)                38  &         70  F        102  f
 7  BEL (bell)                       39  '         71  G        103  g
 8  BS  (backspace)                  40  (         72  H        104  h
 9  TAB (horizontal tab)             41  )         73  I        105  i
 10  LF  (NL line feed, new line)    42  *         74  J        106  j
 11  VT  (vertical tab)              43  +         75  K        107  k
 12  FF  (NP form feed, new page)    44  ,         76  L        108  l
 13  CR  (carriage return)           45  -         77  M        109  m
 14  SO  (shift out)                 46  .         78  N        110  n
 15  SI  (shift in)                  47  /         79  O        111  o
 16  DLE (data link escape)          48  0         80  P        112  p
 17  DC1 (device control 1)          49  1         81  Q        113  q
 18  DC2 (device control 2)          50  2         82  R        114  r
 19  DC3 (device control 3)          51  3         83  S        115  s
 20  DC4 (device control 4)          52  4         84  T        116  t
 21  NAK (negative acknowledge)      53  5         85  U        117  u
 22  SYN (synchronous idle)          54  6         86  V        118  v
 23  ETB (end of trans. block)       55  7         87  W        119  w
 24  CAN (cancel)                    56  8         88  X        120  x
 25  EM  (end of medium)             57  9         89  Y        121  y
 26  SUB (substitute)                58  :         90  Z        122  z
 27  ESC (escape)                    59  ;         91  [        123  {
 28  FS  (file separator)            60  <         92  \        124  |
 29  GS  (group separator)           61  =         93  ]        125  }
 30  RS  (record separator)          62  >         94  ^        126  ~
 31  US  (unit separator)            63  ?         95  _        127  DEL

 */
public class Questions {


    /**
     * Implement an algorithm to determine if a string has all
     * unique characters. What if you can not use additional data structures?
     */
    public static boolean q1_1_v1(String word){

        HashMap<Character, Integer> hashMap = new HashMap<Character, Integer>();

        for(char c : word.toCharArray()){

            if(hashMap.containsKey(c))
                return false;
            else
                hashMap.put(c, 1);
        }

        return true;

    }

    /**
     * What if you can not use additional data structures?
     *
     * @param word
     */
    public static void q1_1_v2(String word){





    }


    /**
     * Write code to reverse a C-Style String (C-String means that “abcd”
     * is represented as five characters, including the null character )
     *
     * v1. Writing back words using new array
     *
     * Ex. abcdefg => gfedcba
     * @param word
     */
    public static String q1_2_v1(String word){

        char[] drow = new char[word.length()];

        int i = 0;

        for(char c : word.toCharArray()){
            drow[(word.length()-1)-i++] = c;
        }

        return String.copyValueOf(drow);
    }


    /**
     * Write code to reverse a C-Style String (C-String means that “abcd”
     * is represented as five characters, including the null character )
     *
     * v2.
     * @param word
     */
    public static String q1_2_v2(String word){

        char[] chars = word.toCharArray();


        for(int i = 0; i <= chars.length / 2; i++){

            int index = chars.length -1;
            char temp = chars[i];

            chars[i] = chars[index-i];
            chars[index-i] = temp;
        }

        return String.copyValueOf(chars);
    }

    /**
     * Design an algorithm and write code to remove the duplicate characters in a string
     * without using any additional buffer NOTE: One or two additional variables are fine.
     * An extra copy of the array is not
     *
     * FOLLOW UP
     * Write the test cases for this method
     * @param word
     */
    public static String q1_3(String word){

        char[] wordChar = word.toCharArray();

        boolean[] existingCharArr = new boolean[1000];

        int currPosition = 0;


        for(int i = 0; i < word.length(); i++){

            char c = word.charAt(i);
            System.out.println(c + 0 + " -> [" + c + "]");

            if((c >= 'A' && c <= 'Z' || c >= 'a' && c <= 'z')){

                if(! existingCharArr[c]){
                    wordChar[currPosition] = c;
                    currPosition++;
                } else {
//                    System.out.println("EXIST -> " + c);
                }

                existingCharArr[c] = true;

            } else {
                if (i+1 < word.length() && wordChar[i] == ' ' && wordChar[i+1] == ' '){
                    continue;
                } else {
                    wordChar[currPosition] = c;
                    currPosition++;
                }
            }
        }

        String s = String.copyValueOf(wordChar).substring(0, currPosition);

        return s;
    }


    /**
     * Write a method to decide if two strings are anagrams or not
     *
     * anagram - a word, phrase, or name formed by rearranging the letters of another, such as cinema, formed from iceman.
     *
     * ex.:
     *      word    == word
     *      word    == rowd
     *      cinema  == iceman
     *
     * @param word1
     * @param word2
     * @return
     */
    public static boolean q1_4(String word1, String word2){

        boolean[] existingChars = new boolean[1000];

        for(int i = 0; i < word1.length(); i++){
            existingChars[word1.charAt(i)] = true;
        }

        for(int j = 0; j < word2.length(); j++){
            if(existingChars[word2.charAt(j)] == false){
                System.out.println("nope");
                return false;
            }
        }

        return true;
    }

    /**
     * Write a method to replace all spaces in a string with ‘%20’
     *
     * @param str
     * @return
     */
    public static String q1_5(String str){
        
        char[] strArr = str.toCharArray();
        
        StringBuilder sb = new StringBuilder(strArr.length);
        
        for(int i=0; i < str.length(); i++){
            
            Character c = strArr[i];
            if(c == ' '){
                sb.append('%').append('2').append('0');
            } else {
                sb.append((char)c);
            }
        }

        return sb.toString();
    }

    /**
     * Given an image represented by an NxN matrix, where each pixel in the image is 4 bytes,
     * write a method to rotate the image by 90 degrees Can you do this in place?
     */
    public static void q1_6(int[][] matrix){

        rotateMatrix(matrix, matrix.length/2);

        throw new NotImplementedException();

    }


    private static void rotateMatrix(int[][] matrix, int level){

        System.out.println("Level " + level);
        int size = matrix.length;

        if(level <= 1){
            return;
        }


        for(int x = 0; x < level; x++){
            for(int y = 0; y < level; y++){
                int temp = matrix[0][0];
                matrix[3][0] = matrix[0][0];
                matrix[3][1] = matrix[1][0];
                matrix[3][2] = matrix[2][0];
                matrix[3][3] = matrix[3][0];

            }
        }

        rotateMatrix(matrix, level-1);
    }

    /**
     * Write an algorithm such that if an element in an MxN matrix is 0,
     * its entire row and column is set to 0.
     */
    public static void q1_7(int[][] matrix){

        int[] cols = new int[matrix.length];
        int[] rows = new int[matrix[0].length];

        for(int x = 0; x < matrix.length; x++){
            for(int y = 0; y < matrix[x].length; y++) {
                if(matrix[x][y] == 0){
//                    cols = x;
//                    rows = y;
                    setRowToZero(matrix, x);
                    setColToZero(matrix, y);
                }
            }
        }
    }

    private static void setRowToZero(int[][] matrix, int row){

        for(int i = 0; i < matrix.length; i++){
            matrix[row][i] = 0;
        }
    }

    private static void setColToZero(int[][] matrix, int col){

        for(int i = 0; i < matrix.length; i++){
            matrix[i][col] = 0;
        }
    }

    /**
     * Assume you have a method isSubstring which checks if one word is a substring of
     * another Given two strings, s1 and s2, write code to check if s2 is a rotation
     * of s1 using only one call to isSubstring (i e , “waterbottle” is a rotation of “erbottlewat”)
     */
    public static boolean q1_8(String w1, String w2){

        return isSubstring(w1, w2);
    }

    private static boolean isSubstring(String s1, String s2){

        if(s1 == null || s2 == null || s1.length() != s2.length()){
            return false;
        }

        int count = 0;

        for(int i = 0; i < s2.length(); i++){

            if(s2.charAt(i) == s1.charAt(count)){


                int position = i;
                while(true){
                    if(position == s2.length()){
                        position = 0;
                    }

                    if(s2.charAt(position++) != s1.charAt(count++))
                        return false;

                    if(count == s1.length()){
                        return true;
                    }
                }
            }

        }

        return false;

    }
}
