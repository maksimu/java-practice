package coursera.algorithms.symbol_table;

/**
 * Created by maksimustinov on 10/1/14.
 */
public class Node<Key extends Comparable<Key>, Data> {
    private Key key;
    private Data data;
    private Node next;

    public Node(Key key, Data data){
        this.key = key;
        this.data = data;
    }

    public Key getKey() {
        return key;
    }

    public void setKey(Key key) {
        this.key = key;
    }

    public Data getData() {
        return data;
    }

    public void setData(Data data) {
        this.data = data;
    }

    public Node getNext() {
        return next;
    }

    public void setNext(Node next) {
        this.next = next;
    }
}
