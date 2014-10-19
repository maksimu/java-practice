package heap;

import arrays.ArrayHelper;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.*;

public class HeapImplTest {

    @Test
    public void testInsert() throws Exception {

        HeapImpl heap = new HeapImpl();

        heap.insert(15);
        heap.insert(10);
        heap.insert(9);
        heap.insert(8);
        heap.insert(7);
        heap.insert(6);
        heap.insert(3);
        heap.insert(4);
        heap.insert(2);

        System.out.println();

        heap.insert(12);

        heap.delete(3);

    }



}