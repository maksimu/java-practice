package coursera.algorithms.quickfind;

/**
 * Created by maksimustinov on 9/13/14.
 */
public class WeightedQuickUnionUF {

    private int ids[];
    private int sz[];

    public WeightedQuickUnionUF(int N){
        ids = new int[N];

        for(int i = 0; i < ids.length - 1; i++){
            ids[i] = i;
        }
    }

    private int root(int item){

        while(item != ids[item]){

            ids[item] = ids[ids[item]]; // flattening the tree by assigning them to the most root as possible. AKA Path compression
            item = ids[item];
        }
        return item;
    }

    public boolean connected(int p, int q){
        return root(p) == root(q);
    }

    public void union(int p, int q){
        int proot = root(p);
        int qroot = root(q);


        if(proot == qroot){
            return;
        }

        if(sz[proot] < sz[qroot]){
            ids[proot] = qroot;
            sz[qroot] += sz[proot];
        } else {
            ids[qroot] = proot;
            sz[proot] += sz[qroot];
        }

        ids[proot] = qroot;
    }
}
