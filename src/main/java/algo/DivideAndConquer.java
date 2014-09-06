package algo;

import arrays.ArrayHelper;

/**
 * Created by maksimustinov on 9/1/14.
 */
public class DivideAndConquer {


    public static void main(String... args){

        int[] randomInts = ArrayHelper.randomArray(90);

        int index = 1;

        for(int i : randomInts){
            System.out.println(index++ + "] --> " + i);
        }
    }



}
