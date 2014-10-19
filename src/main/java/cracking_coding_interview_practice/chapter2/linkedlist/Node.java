package cracking_coding_interview_practice.chapter2.linkedlist;

/**
 * Created by maksimustinov on 10/18/14.
 */
public class Node {

    int id;
    Node next;

    public int getId(){
        return id;
    }
    public void setNext(Node node){
        this.next = node;
    }
    public Node getNext(){
        return next;
    }


    public Node(int id){
        this.id = id;
    }

    public Node(int id, Node node){
        this.id = id;
        this.next = node;
    }

}
