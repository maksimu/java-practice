package coursera.algorithms.quickfind;

/**
 * Created by maksimustinov on 9/12/14.
 */
public class QuickUnionUF {

    int[] ids;

    public QuickUnionUF(int N){
        ids = new int[N];

        for(int i = 0; i < N; i++){
            ids[i] = i;                     // O(n)
        }
    }

    // finding a root by chasing a parent element
    private int root(int item){
        while(item != ids[item]){
            item = ids[item];
        }

        return item;
    }

    //
    public boolean connected(int p, int q){
        // Check if p and q have the same root
        return root(p) == root(q);
    }

    public void union(int p, int q){

        // find two roots
        int pRoot = root(p);
        int qRoot = root(q);
        ids[pRoot] = qRoot;
    }
}
