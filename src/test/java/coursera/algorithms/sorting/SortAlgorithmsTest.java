package coursera.algorithms.sorting;

import org.junit.Test;

public class SortAlgorithmsTest {

    @Test
    public void testSort() throws Exception {

        Data[] d = Data.getArray(
                new Data(2l, "b"),
                new Data(4l, "c"),
                new Data(1l, "a"),
                new Data(8l, "e"),
                new Data(6l, "d"),
                new Data(5l, "b"),
                new Data(9l, "c"),
                new Data(3l, "a"),
                new Data(7l, "e"),
                new Data(10l, "d")
        );

//        SortAlgorithms.sort(d);

        Data.shellSort(d);
        print(d);
        Data.shuffle(d);
        print(d);

        Data.shuffle(d);
        print(d);

    }


    private static void print(Data[] p){
        System.out.println();
        for (Data data : p) {
            System.out.println(" - " + data.getId() + " [" + data.getName());
        }

    }
}