package coursera.algorithms.stacks;

import coursera.algorithms.Node;

/**
 * Created by maksimustinov on 9/18/14.
 */
public class StackOfStrings implements Stack<String> {





    public StackOfStrings(){

    }

    private Node firstNode = null;


    public void addNode(Node node){
        if(firstNode == null){
            firstNode = node;
        } else {
            firstNode.setNext(node);
        }
    }

    /**
     * just return the first node
     */
//    public String pop(){
//        if(firstNode != null){
//            firstNode = firstNode.getNext();
//        }
//
//
//    }

    /**
     * just add a new node in the beginning of the list
     * @param data
     */
    public void push(String data){
        Node oldNode = firstNode;
        Node newNode = new Node(data);
        newNode.setNext(oldNode);
        firstNode = newNode;
    }

    @Override
    public String pop() {
        return null;
    }

    public boolean isEmpty(){
        return firstNode == null;
    }




    @Override
    public int size() {
        return -1 ;
    }
}
