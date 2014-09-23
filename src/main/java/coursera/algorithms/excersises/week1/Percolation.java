//package coursera.algorithms.excersises.week1;
//
//
///**
// * Created by maksimustinov on 9/20/14.
// */
//public class Percolation {
//
//    int N;
//    private int[] grid;
//
//    WeightedQuickUnionUF weightedQuickUnionUF;
//
//    // create N-by-N grid, with all sites blocked
//    public Percolation(int N) {
//
//        if (N <= 0) {
//            throw new IllegalArgumentException();
//        }
//
//        int gridSize = N * N;
//
//        weightedQuickUnionUF = new WeightedQuickUnionUF(gridSize);
//        grid = new int[gridSize];
//
//        // Initialize grid to be blocked
//        for (int i = 0; i < gridSize; i++) {
//            grid[i] = 0;
//        }
//
//    }
//
//    /**
//     * The open() method should do three things.
//     * - First, it should validate the indices of the site that it receives.
//     * - Second, it should somehow mark the site as open.
//     * - Third, it should perform some sequence of WeightedQuickUnionUF operations that
//     * links the site in question to its open neighbors.
//     * <p/>
//     * The constructor and instance variables should facilitate the open() method's ability to do its job.
//     *
//     * @param i
//     * @param j
//     */
//    // open site (row i, column j) if it is not already
//    public void open(int i, int j) {
//        checkInput(i, j);
//
//        if (isOpen(i, j)) {
//            return;
//        }
//
//
//
//
//
//
//
//        weightedQuickUnionUF.union(i, j);
//    }
//
//    // is site (row i, column j) open?
//    public boolean isOpen(int i, int j) {
//        checkInput(i, j);
//
//        return weightedQuickUnionUF.connected(i, j);
//    }
//
//    // is site (row i, column j) full?
//    public boolean isFull(int i, int j) {
//        checkInput(i, j);
//        return weightedQuickUnionUF.connected(i, j);
//    }
//
//    // does the system percolate?
//    public boolean percolates() {
//
//        return false;
//    }
//
//    private void checkInput(int i, int j) {
//        if (i <= 0
//                || j <= 0
//                || i > N
//                || j > N) {
//            throw new IndexOutOfBoundsException();
//        }
//    }
//
//    private int getLocation(int row, int column){
//        return (N*(row-1))+column-1;
//    }
//}
