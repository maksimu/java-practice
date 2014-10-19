package cracking_coding_interview_practice.chapter2.linkedlist;

/**
 * Created by maksimustinov on 10/18/14.
 */
public class NodeOperations {

    private Node root;
    private int size = 0;

    public int getSize(){
        return size;
    }

    public Node add(Node nodeToAdd){

        if(root == null){
            root = nodeToAdd;
            size++;
        } else {
            Node currentNode = root;

            while(true){
                if(currentNode.getNext() == null){
                    currentNode.setNext(nodeToAdd);
                    size++;
                    break;
                } else {
                    currentNode = currentNode.getNext();
                }
            }
        }

        return root;
    }

    public Node delete(int id){

        Node curNode = root;

        if(curNode.getId() == id){
            root = curNode.getNext();
            size--;
        } else {
            while (curNode.getNext() != null) {

                if (curNode.getNext().getId() == id) {
                    curNode.setNext(curNode.getNext().getNext());
                    size--;
                    break;
                }
                curNode = curNode.getNext();
            }
        }

        return root;
    }
}
