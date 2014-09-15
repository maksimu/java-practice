package dynamic_programming;

/**
 * Created by maksimustinov on 9/15/14.
 */
public class Problems {


    public static void main(String... args){

        int n = 10;

        System.out.println("==== " + countPossibilities(n));
    }

    static int count = 0;

    public static int countPossibilities(int n) {

        int myId = count++;

        System.out.println ("> [" + myId + "] < " + n + " ");
        if (n == 1 || n == 2) {
            System.out.println("< [" + myId + "] >> " + n);
            return n;
        }

        int val1 = countPossibilities(n - 1);
        int val2 = countPossibilities(n - 2);

        int val = val1 + val2;

        System.out.println("< [" + myId + "] > countPossibilities(" + (n - 1) + ") + countPossibilities(" + (n - 2) + ") = " + val);
        System.out.println("< [" + myId + "] > val1(" + val1 + ") + val2(" + val2 + ") = " + val);

        return val;
    }

    /**
     * A man is running up a staircase with n steps, and can go either 1 steps, 2 steps, or 3 steps at a time.
     * Now write a program to count how many possible ways the child can run the stairs.
     *
     * Source: http://stackoverflow.com/questions/17779299/java-programming-dynamic-programming-on-stairs-example
     */
    public static int countDP(int n, int[] map){

        if (n<0)
            return 0;
        else if (n==0) {
            return 1;
        }
        else if (map[n]>-1) {
            return map[n];
        }
        else {
            System.out.println("countDP(" + (n-1) + "," + arrToStr(map) + ") + countDP(" + (n-2) + "," + arrToStr(map) + ") + countDP(" + (n-3) + ", " + arrToStr(map) + ")");
            map[n] = countDP(n-1, map) + countDP(n-2, map) + countDP(n-3, map);

            System.out.println("returning: map[" + n + "] = " + map[n]);
            return map[n];
        }

    }

    private static String arrToStr(int[] map){
        StringBuilder sb = new StringBuilder();

        for(int i : map){
            sb.append("[").append(i).append("]");
        }

        return sb.toString();
    }
}
