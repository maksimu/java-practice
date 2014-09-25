package coding_exercises;

/**
 *
 -->  Implement flood fill (four-way): suppose each number represents a color,
        suppose the currently selected color is 2 (the color that will be painted),
        and suppose you click on the X (whose value is also 0) on the picture on the left.

        Your algorithm should end up with the picture on the right (as a follow up, do it in N dimensions):

         111111111                       111111111
         111111111                       111111111
         110000011                       112222211
         1100x0011          ==>          112222211
         110000011                       112222211
         111111111                       111111111
         111111111                       111111111

 * Created by maksimustinov on 9/23/14.
 */
public class FloodFill1 {

    public static void main(String ... args){

        int[][] source = {
                {1,1,1,1,1,1,1,1,1},
                {1,1,1,1,1,1,1,1,1},
                {1,1,0,0,0,0,0,1,1},
                {1,1,0,0,0,0,0,1,1},
                {1,1,0,0,0,0,0,1,1},
                {1,1,1,1,1,1,1,1,1},
                {1,1,1,1,1,1,1,1,1}
        };

        FloodFill1 floodFill1 = new FloodFill1();
        floodFill1.print2DArray(source);
        floodFill1.floodFill1_N(source, 4, 4, 2);
        floodFill1.print2DArray(source);

    }






    public void floodFill1(int[][] source, int x, int y, int changeTo){

        int v1 = source[x][y];

        for(int yIter = 0; yIter < source.length; yIter++ ) {                       // y-iterator
            for (int xIter = 0; xIter < source[yIter].length; xIter++ ) {           // x-iterator

                if (source[yIter][xIter] == v1) {
                    source[yIter][xIter] = changeTo;
                }
            }
        }
    }

    public void floodFill1_N(int[][] source, int x, int y, int changeTo){

        int v1 = source[x][y];
        int xLength = source.length;
        int yLength = source[0].length;
        int total = xLength * yLength;

        int xIter = 0;
        int yIter = 0;

        for(int i = 0; i < total; i++){


            if (xIter < xLength && source[yIter][xIter] == v1) {
                source[yIter][xIter] = changeTo;
            }


            if(i > 0 && i % yLength == 0){
                yIter++;
                xIter = 0;
            }

            xIter++;
        }


    }














    public void print2DArray(int[][] twoDArray){
        System.out.println();
        for(int yIter = 0; yIter < twoDArray.length; yIter++ ) {            // y-iterator
            for (int xIter = 0; xIter < twoDArray[yIter].length; xIter++) {         // x-iterator
                System.out.print(twoDArray[yIter][xIter] + " ");
            }
            System.out.println();
        }

    }
}
