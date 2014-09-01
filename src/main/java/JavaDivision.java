/**
 * Created by maksimustinov on 8/29/14.
 */
public class JavaDivision {

    public static void main(String... args){

        div(50, 23);

    }

    public static void div(Integer n1, Integer n2){
        int q = 0;
        int sum = 0;
        int rem = 0;
        while( sum < n1 ){
            sum += n2;
            rem = n1-sum;
            q++;
        }

        System.out.println("q=["+q+"], sum=["+sum+"], rem=["+rem+"]");
    }
}
