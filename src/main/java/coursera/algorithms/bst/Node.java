package coursera.algorithms.bst;

import lombok.Data;

/**
 * Created by maksimustinov on 10/1/14.
 */
@Data
public class Node<Key extends Comparable<Key>> {

    private Key key;
    private String value;
    private Node<Key> leftNode;
    private Node<Key> rightNode;

    public Node(Key key, String value){
        this.key = key;
        this.value = value;
    }
}
