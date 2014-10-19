package cracking_coding_interview_practice.chapter2.linkedlist;

import org.junit.Test;

import static org.junit.Assert.*;

public class NodeOperationsTest {

    @Test
    public void testAdd() throws Exception {

        NodeOperations nodeOperations = new NodeOperations();

        nodeOperations.add(new Node(1));
        nodeOperations.add(new Node(2));
        nodeOperations.add(new Node(3));
        nodeOperations.add(new Node(4));
        nodeOperations.add(new Node(5));

        System.out.println("Size: " + nodeOperations.getSize());

        nodeOperations.delete(4);

        System.out.println("Size: " + nodeOperations.getSize());
    }
}