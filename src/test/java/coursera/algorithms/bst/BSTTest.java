package coursera.algorithms.bst;

import org.junit.Test;

import static org.junit.Assert.*;

public class BSTTest {

    @Test
    public void testPut() throws Exception {

        BST<Integer> bst = new BST<Integer>();

        bst.put(2, "two");
        bst.put(3, "three");
        bst.put(4, "four");

        bst.toString();
    }
}