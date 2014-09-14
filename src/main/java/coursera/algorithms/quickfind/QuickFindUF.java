package coursera.algorithms.quickfind;

/**
 * Created by maksimustinov on 9/12/14.
 */
public class QuickFindUF {

    private int[] ids;

    public QuickFindUF(int N){
        ids = new int[N];

        for(int i = 0; i < N; i++){
            ids[i] = i;
        }
    }

    public boolean connected(int p, int q){
        return ids[p] == ids[q];
    }


    /**
     * Union using QUICK FIND
     * @param p
     * @param q
     */
    public void union(int p, int q){

        int pid = ids[p];
        int qid = ids[q];

        // change all entries with id[p] to id[q]
        // O(2N + 2) - At most 2N+2 array accesses
        for(int i = 0; i < ids.length; i++){
            if(ids[i] == pid){
                ids[i] = qid;
            }
        }

    }
}
