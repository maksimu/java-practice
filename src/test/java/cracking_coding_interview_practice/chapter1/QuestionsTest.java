package cracking_coding_interview_practice.chapter1;

import org.junit.Test;

import static org.junit.Assert.*;

public class QuestionsTest {

    String w1 = "abcdefg";
    String w2 = "abcdeffg";

    @Test
    public void testQ1_1_v1() throws Exception {

        assertTrue(Questions.q1_1_v1(w1));
        assertFalse(Questions.q1_1_v1(w2));
    }

    @Test
    public void testQ1_1_v2() throws Exception {

    }


    @Test
    public void testQ1_2_v1() throws Exception {
        assertTrue("abcdefg".equals(Questions.q1_2_v1("gfedcba")));
        assertFalse("abcdefg".equals(Questions.q1_2_v1("abcdefg")));
        assertTrue("abcdefg".equals(Questions.q1_2_v2("gfedcba")));
        assertFalse("abcdefg".equals(Questions.q1_2_v2("abcdefg")));
    }

    @Test
    public void testQ1_2_v2() throws Exception {

    }

    @Test
    public void testQ1_3() throws Exception{

       //  assertTrue("abcdefg"        .equals(Questions.q1_3("abcdefg")));
//        assertTrue("abcdefG"        .equals(Questions.q1_3("abcdefG")));
//        assertTrue("abcdefgG"        .equals(Questions.q1_3("abcdefgGG")));
//        assertTrue("abcdefg"       .equals(Questions.q1_3("abcdefggggg")));
//        assertTrue("a"              .equals(Questions.q1_3("a")));
//        assertTrue("a"         .equals(Questions.q1_3("aaaaaaaaaa")));
//        assertTrue("a b c d e"  .equals(Questions.q1_3("aa b cc d eee")));
        System.out.println(
                Questions.q1_3("ASCII stands for American Standard Code for Information Interchange. Below is the ASCII character table, including descriptions of the first 32 characters. ASCII was originally designed for use with teletypes, and so the descriptions are somewhat obscure and their use is frequently not as intended."
        ));
    }

    @Test
    public void testQ1_4() throws Exception{
        assertTrue(Questions.q1_4("word", "drow"));
        assertFalse(Questions.q1_4("abcd", "abcde"));
        assertTrue(Questions.q1_4("asdf asdf", "asdf asdf"));
    }

    @Test
    public void testQ1_5() throws Exception{
        String res = Questions.q1_5("a b");

        System.out.println(res);
        assertTrue("a%20b".equals(res));
        assertTrue("ab".equals(Questions.q1_5("ab")));
        assertTrue("ab%20%20%20%20c".equals(Questions.q1_5("ab    c")));
        assertTrue("%20%20%20".equals(Questions.q1_5("   ")));
    }


    @Test
    public void testQ1_6() throws Exception{

        int[][] matrix = {
                {1, 1, 1, 1},
                {2, 2, 2, 2},
                {3, 3, 3, 3},
                {4, 4, 4, 4}
        };

        Questions.q1_6(matrix);
    }

    @Test
    public void testQ1_7() throws Exception{

        int[][] matrix = {
                {1, 1, 1, 1},
                {2, 2, 2, 2},
                {3, 0, 3, 3},
                {4, 4, 4, 4}
        };

        Questions.q1_7(matrix);


        printMatrix(matrix);
    }

    @Test
    public void testQ1_8() throws Exception{

        assertFalse(Questions.q1_8("one", null));
        assertFalse(Questions.q1_8(null, "one"));
        assertTrue(Questions.q1_8("one", "one"));
        assertTrue(Questions.q1_8("one", "neo"));
        assertTrue(Questions.q1_8("one", "eon"));
        assertTrue(Questions.q1_8("waterbottle", "erbottlewat"));
        assertFalse(Questions.q1_8("waterbottle", "erbottlewa"));
        assertFalse(Questions.q1_8("waterbottle", "rbottlewat"));
    }

    private void printMatrix(int[][] matrix) {

        for (int x = 0; x < matrix.length; x++) {
            for (int y = 0; y < matrix[x].length; y++) {
                System.out.print("[" + matrix[x][y]);
            }
            System.out.println();
        }
    }
}