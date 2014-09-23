
import org.junit.Test;

import static org.junit.Assert.*;

public class WeightedQuickUnionUFTest {

    @Test
    public void testQuickUnionUF() throws Exception {

        QuickFindUF cell = new QuickFindUF(10);



        cell.union(6,8);
        cell.union(0,1);
        cell.union(4,6);
        cell.union(8,9);
        cell.union(7,6);
        cell.union(6,0);

        System.out.println(cell.count());
    }




    @Test
    public void testWeightedQuickUnionUF() throws Exception {

        WeightedQuickUnionUF cell = new WeightedQuickUnionUF(10);


        cell.union(0,9);
        cell.union(7,2);
        cell.union(5,0);
        cell.union(4,6);
        cell.union(3,1);
        cell.union(3,2);
        cell.union(9,6);
        cell.union(1,6);
        cell.union(7,8);

        boolean isConnected = cell.connected(7,0);

        System.out.println("is connected: " + isConnected);


    }
}