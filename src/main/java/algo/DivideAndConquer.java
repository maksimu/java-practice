package algo;

import helper.Helper;

/**
 * Created by maksimustinov on 9/1/14.
 */
public class DivideAndConquer {


    public static void main(String... args){

        int[] randomInts = Helper.randomArray(90);

        int index = 1;

        for(int i : randomInts){
            System.out.println(index++ + "] --> " + i);
        }
    }



}
