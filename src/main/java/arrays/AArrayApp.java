package arrays;

/**
 * Created by maksimustinov on 9/3/14.
 */
public class AArrayApp {

    public static void main(String... args){

        AArray aArray = new AArray(600);
        aArray.insert2(11);
        aArray.insert2(22);
        aArray.insert2(33);
        aArray.insert2(44);
        aArray.insert2(55);
        aArray.insert2(66);
        aArray.insert2(77);
        aArray.insert2(88);
        aArray.insert2(99);

        System.out.println(aArray);

//        aArray.delete(33);
//        System.out.println(aArray);

        int searchKey = 883;
        int foundIndex = aArray.binarySearch(searchKey);

        System.out.println(foundIndex < 0 ? "Found valued at index : [" + foundIndex + "]" : "Not found key=" + searchKey);


    }
}
