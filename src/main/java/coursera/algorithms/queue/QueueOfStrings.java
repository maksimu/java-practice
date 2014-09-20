package coursera.algorithms.queue;

import coursera.algorithms.Node;

/**
 * Created by maksimustinov on 9/19/14.
 */
public class QueueOfStrings {


    Node<String> firstNode, lastNode;

    int size = 0;

    /**
     * Insert a new string into a queue
     *
     * @param item
     */
    void enqueue(String item) {
        Node<String> willBeLast = new Node<String>(item);
        Node<String> oldLast = lastNode;

        if (isEmpty())
            firstNode = willBeLast;
        else
            oldLast.setNext(willBeLast);

    }

    /**
     * Remove and return the string least recently added
     *
     * @return
     */
    Node dequeue() {

        Node<String> nextNode = null;


        if (isEmpty()) {
            lastNode = null;

        } else {
            nextNode = firstNode.getNext();
            firstNode = nextNode;
        }

        return nextNode;
    }


    /**
     * Is the queue empty?
     *
     * @return
     */
    boolean isEmpty() {
        return firstNode == null;
    }


}
