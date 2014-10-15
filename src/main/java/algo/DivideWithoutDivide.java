package algo;

/**
 * Created by maksimustinov on 10/5/14.
 */
public class DivideWithoutDivide {

    public static int divide(int num1, int num2){

        int count = 0;
        while(num1 > 0){

             num1 = num1 - num2;

            count++;
        }

        return count;
    }
}
