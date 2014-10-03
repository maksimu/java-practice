package coursera.algorithms.bst;

import lombok.Data;

/**
 * Created by maksimustinov on 10/1/14.
 */
@Data
public class Node {

    int key;
    String value;
    Node leftNode;
    Node rightNode;

    public Node(int key, String value){
        this.key = key;
        this.value = value;
    }
}
