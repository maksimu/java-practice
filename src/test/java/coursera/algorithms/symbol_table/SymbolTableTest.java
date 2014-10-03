package coursera.algorithms.symbol_table;

import org.junit.Test;

import static org.junit.Assert.*;

public class SymbolTableTest {

    @Test
    public void testPut() throws Exception {

        SymbolTable<String, Integer> table = new LinkedLIstST<String, Integer>();
        table.put("one", 1);
        table.put("two", 2);
        table.put("thr", 3);
        table.put("for", 4);

        for(String key: table.keys()){
            System.out.println(key + " ---> " + table.get(key));
        }

    }

    @Test
    public void testGet() throws Exception {

    }

    @Test
    public void testContain() throws Exception {

    }

    @Test
    public void testDelete() throws Exception {

    }

    @Test
    public void testIsEmpty() throws Exception {

    }

    @Test
    public void testSize() throws Exception {

    }

    @Test
    public void testKeys() throws Exception {

    }
}