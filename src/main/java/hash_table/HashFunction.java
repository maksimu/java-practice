package hash_table;

/**
 * Created by maksimustinov on 9/15/14.
 */
public class HashFunction {

    String[] array;
    int arraySize;


    public HashFunction(int arraySize){
        this.arraySize = arraySize;
        array = new String[arraySize];

        for(int i = 0; i < arraySize; i++){
            array[i] = "-1";
        }
    }
}
