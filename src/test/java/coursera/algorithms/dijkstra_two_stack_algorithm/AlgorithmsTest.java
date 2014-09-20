package coursera.algorithms.dijkstra_two_stack_algorithm;

import org.junit.Test;

public class AlgorithmsTest {

    Algorithms a = new Algorithms();
    @Test
    public void testDijkstraTwoStackAlgorithmCalc() throws Exception {

        String equation = "1+(2+(3*5))";

        System.out.println(" ---> " + a.dijkstraTwoStackAlgorithmCalc(equation));

    }
}