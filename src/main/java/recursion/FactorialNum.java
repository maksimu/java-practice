package recursion;

/**
 * Created by maksimustinov on 9/27/14.
 */
public class FactorialNum {

    public static void main(String[] args){


        int num = 10 ;

        System.out.println("Factorial " + num + " = " + factorial(num));


    }


    public static long factorial(long num){

        if(num == 0){
            return 1;
        } else {
            num = num * factorial(num-1);
        }

        return num;
    }

}
