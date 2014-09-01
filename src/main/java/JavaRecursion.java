import java.util.ArrayList;
import java.util.List;

/**
 * Created by maksimustinov on 8/28/14.
 */
public class JavaRecursion {

    public static  void main(String... args){
        JavaRecursion javaRecursion = new JavaRecursion();

        String strToReverse = "The function takes the first character of a String - str.charAt(0) - puts it at the end and then calls itself - reverse() - on the remainder - str.substring(1), adding these two things together to get its result - reverse(str.substring(1)) + str.charAt(0)";

        System.out.println("Before: " + strToReverse);

        System.out.print("After: " + javaRecursion.reverse(strToReverse));

    }

    /**
     *
     The function takes the first character of a String - str.charAt(0) - puts it at the end and then calls itself - reverse() - on the remainder - str.substring(1), adding these two things together to get its result - reverse(str.substring(1)) + str.charAt(0)

     When the passed in String is one character or less and so there will be no remainder left - when str.length()  <= 1) - it stops calling itself recursively and just returns the String passed in.

     So it runs as follows:

     reverse("Hello")
     (reverse("ello")) + "H"
     ((reverse("llo")) + "e") + "H"
     (((reverse("lo")) + "l") + "e") + "H"
     ((((reverse("o")) + "l") + "l") + "e") + "H"
     (((("o") + "l") + "l") + "e") + "H"
     "olleH"


     * @param str
     * @return
     */

    public static String reverse(String str) {
        if ((null == str) || (str.length() <= 1)) {
            return str;
        }
        return reverse(str.substring(1)) + str.charAt(0);
    }



}
