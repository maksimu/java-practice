package coding_exercises;

/**
 * Created by maksimustinov on 9/24/14.
 */
public class StringToInt {

    public static void main(String... args) {

        System.out.println(stringToInt("999"));
    }

    public static int stringToInt(String stringInt) {

        char[] chars = stringInt.toCharArray();

        boolean isNegative = false;

        int i = 0;

        if (chars[0] == '-') {
            isNegative = true;
            i = 1;
        }

        int val = 0;

        for (; i < chars.length; i++) {
            int currentCharVal = chars[i] - '0';

            val = val * 10; // of course the first will be 0, 0x10=0.
            int valBefore = val;

            val = val + currentCharVal;

            System.out.println(valBefore + "+" + currentCharVal + " = " + val);
        }

        if(isNegative){
            val = -val;
        }
        return val;
    }
}
