package coursera.algorithms.symbol_table;

import linkedlist.ListElement;

/**
 * Created by maksimustinov on 9/30/14.
 */
public class LinkedLIstST<Key extends Comparable<Key>, Value> implements SymbolTable<Key, Value> {


    Node<Key, Value> head;

    public LinkedLIstST() {
    }

    @Override
    public void put(Key key, Value value) {

        if(head == null){
            head = new Node<Key, Value>(key, value);
        } else {

            Node thisNode = head;

            while (true) {
                if (thisNode.getNext() == null) {
                    Node newElement = new Node<Key, Value>(key, value);
                    thisNode.setNext(newElement);
                    break;
                }
            }
        }
    }

    @Override
    public Value get(Key key) {


        return null;
    }

    @Override
    public boolean contain(Key key) {
        return get(key) != null;
    }

    @Override
    public void delete(Key key) {

    }

    @Override
    public boolean isEmpty() {
        return false;
    }

    @Override
    public int size() {
        return 0;
    }

    @Override
    public Iterable<Key> keys() {
        return null;
    }


}
