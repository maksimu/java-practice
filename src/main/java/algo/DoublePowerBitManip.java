package algo;

import sun.security.util.BigInt;

import java.math.BigDecimal;
import java.math.BigInteger;

/**
 * Created by maksimustinov on 9/27/14.
 *
 * http://www.careercup.com/question?id=14959760
 *
 * Explanation: http://rodrigosasaki.com/2013/06/06/bit-shift-and-bitwise-operators/
 * Examples:    http://www.tutorialspoint.com/java/java_bitwise_operators_examples.htm
 *
 */
public class DoublePowerBitManip {



    public static void main(String[] args){

        t(4);
    }

    public static void t(int exp){

        System.out.println("exp=" + exp + " => bit=[" + Integer.toBinaryString(exp) + "]");
        int r = exp & exp;

        Integer.toBinaryString(343);

        System.out.println(r + " = " + Integer.toBinaryString(r));


        /**
         * AND (&) operator
         *
         * The result will be 1 if, and only if, both operands are 1.
         */
        int a = 60; 	            /* 60 =     0011 1100 */
        int b = 13;	                /*  13 =    0000 1101 */
        System.out.println(a & b);  // =        0000 1100


        /**
         * OR (|) operator
         *
         * The result will be 1 whenever either of the operands is 1.
         */
                                    //          0011 1100
                                    //          0000 1101
        System.out.println(a | b);  //          0011 1101 // enable all that are enabled


        /**
         * XOR (^) operator
         *
         * The result will be 1 if, and only if, one of the operands is 1.
         */
                                    //          0011 1100
                                    //          0000 1101
        System.out.println(a ^ b);  //          0011 0001


        /**
         * NOT (~) operator
         */
                                    //       a= 0011 1100
        System.out.println(~a);     //          1100 0011

        System.out.println(a << 2); // 240      1111 0000 // shifts bits to the left two positions


        System.out.println(a >> 2); // 15            1111 // shifts bits to the right two positions


        System.out.println(a >>> 2);// 15       0000 1111 // shifts bits to the right two positions


        int E = 3;
        double d1 = 3E43;
        double d2 = 1.07E-4;

        System.out.println(d1);
        System.out.println(d2);
    }
}
