package helper;

/**
 * Created by maksimustinov on 9/1/14.
 */
public class Helper {


    public static int[] randomArray(int size){


        //create array with size n+1
        int[] array=new int[size];
        //asign value into the array
        for (int i=0;i<size;i++){
            array[i]=(int) Math.round(Math.random()*89+10);
        }

        return array;
    }
}
