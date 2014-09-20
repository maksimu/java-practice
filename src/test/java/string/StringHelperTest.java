package string;

import helper.StdDraw;
import org.junit.Test;

import static org.junit.Assert.*;

public class StringHelperTest {


    String text = "total0ooOO";
    @Test
    public void testFindFirstNonrepeatedCharacter() throws Exception {

    }

    @Test
    public void testFindFirstRepeatedCharacter() throws Exception {

        int index = StringHelper.findFirstNonRepeatedCharacter2(text);

        System.out.println("Index: " +  index + ", Letter: " + text.charAt(index));
    }

    @Test
    public void testExR1(){
        System.out.println(exR1(6));

        System.out.println(true && false || true && true    );

    }


    public static String exR1(int n)
    {
        if (n <= 0) return "";
        return exR1(n-3) + n + exR1(n-2) + n;
    }
}