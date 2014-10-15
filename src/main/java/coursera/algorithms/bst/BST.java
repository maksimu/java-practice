package coursera.algorithms.bst;

import lombok.Data;

/**
 * Created by maksimustinov on 10/1/14.
 */

@Data
public class BST<Key extends Comparable<Key>> {

    private Node<Key> root;

    public void put(Key key, String value){
        root = put(root, key, value);
    }

    private Node<Key> put(Node<Key> parent, Key key, String value){

        if(parent == null){
            return new Node<Key>(key, value);
        }


        int compareVal = key.compareTo(parent.getKey());

        if(compareVal < 0){
            parent.setLeftNode(put(parent.getLeftNode(), key, value));
        } else if (compareVal > 0) {
            parent.setRightNode(put(parent.getRightNode(), key, value));
        } else {
            parent.setValue(value);
        }

        return parent;
    }


    public String get(Key key){

        Node<Key> x = root;

        while(x != null){
            if(key == x.getKey()){
                return x.getValue();
            } else if(key.compareTo(x.getKey()) > 0){
                x = x.getRightNode();
            } else {
                x = x.getLeftNode();
            }
        }

        return null;
    }

    public void deleteMin(){

        root = deleteMin(root);
    }

    private Node<Key> deleteMin(Node<Key> node){

        if(node.getLeftNode() == null){
            return node.getRightNode();
        }

        node.setLeftNode(deleteMin(node.getLeftNode()));

        return node;
    }

    public void delete(int key){

    }

    public Iterable<Integer> iterator(){
        return null;
    }
}
