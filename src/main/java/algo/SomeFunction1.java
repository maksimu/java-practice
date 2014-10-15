package algo;

/**
 * Created by maksimustinov on 10/5/14.
 */
public class SomeFunction1 {


    /**
     *  1) What does it do?
     *  2) Write the same algorithm using recursion
     * @param num
     * @return
     */
    int f(int num) {

        int out = 0;
        for (; num > 0; num /= 10) {
            int d = num % 10;
            out *= 10;
            out += d;
        }
        return out;
    }

}
