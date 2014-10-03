package algo;

/**
 * Created by maksimustinov on 9/27/14.
 */
public class DoublePower {


    public static void main(String[] args){
        System.out.println("----> 4.3^2  = " + pow(4.3,   2));
        System.out.println("---->   3^0  = " + pow(3,     0));
        System.out.println("---->-0.5^-7 = " + pow(-0.5, -7));
    }


    public static double pow(double n, int p){

        if(n == 0 || p == 0){
            return 1;
        }


        double pN = n;

        int numOfIteration = abs(p);
        boolean isPowerNegative = p < 0;

        for (int i = 0; i < numOfIteration-1; i++){
            pN = pN * n;
        }

        return pN;
    }



    public static int abs(int num){
        if(num < 0){
            return num*-1;
        } else {
            return num;
        }
    }
}
