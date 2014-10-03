package coursera.algorithms.bst;

import lombok.Data;

/**
 * Created by maksimustinov on 10/1/14.
 */

@Data
public class BST {

    private Node root;

    public void put(int key, String value){



    }

    public String get(int key){


        Node x = root;

        while(x != null){
            if(key == x.key){
                return x.getValue();
            } else if(key > x.key){
                x = x.rightNode;
            } else {
                x = x.leftNode;
            }
        }

        return null;
    }

    public void delete(int key){

    }

    public Iterable<Integer> iterator(){
        return null;
    }
}
