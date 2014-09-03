package binary_tree;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by maksimustinov on 9/1/14.
 */
public class NodeHelper {

    public static Node findNode(Node node, int key){

        while (node != null){

            if(node.getValue() == key){
                return node;
            }

            if (node.getValue() < key){
                node = node.getRightChildren();
            } else {
                node = node.getLeftChildren();
            }
        }

        return node;
    }

    public static Node findNodeRecursively(Node node, int key){

        if(node == null){
            return null;
        }

        int currentValue = node.getValue();

        if(currentValue == key){
            return node;
        }

        if(currentValue < key){
            return findNodeRecursively(node.getRightChildren(), key);
        } else {
            return findNodeRecursively(node.getLeftChildren(), key);
        }
    }

    Node root; // needed to perform task on this, since there are no pass-by-reference in Java :(
    /**
     * Insert a new node for a given key into a given root node. Will create a new root node
     * @param r Root node
     * @param key key to insert
     * @return Root node
     */
    public Node insert(Node r, int key){

        root = r;

        /*
        Take care of the root element. If this tree is a new one then we need to initiate it.
         */
        if(root == null){
            root = new Node(key, null, null);
        } else {
            return root.insert(key) ? root : null ;
        }

        return root;
    }


    /**
     * Search: Breadth-First Search (BFS)
     */
    public Node breadFistSearch(Node root, int key){

        List<Node> queue = new ArrayList<Node>();

        queue.add(root);

        while(queue.size() > 0){

            List<Node> tempQueue = new ArrayList<Node>();
            for(Node n : queue){
                System.out.print(n);

                if(n!=null) {
                    if (n.getValue() == key) {
                        System.out.print(" <-- Found");
                        return n;
                    }


                    tempQueue.add(n.getLeftChildren());
                    tempQueue.add(n.getRightChildren());
                }
            }

            queue.clear();

            for(Node n : tempQueue){
                queue.add(n);
            }

            System.out.println();
        }

        return null;
    }


    /**
     * Search: Depth-First Search (DFS)
     */
    public Node depthFirstSearch(Node node){
        return null;
    }
}
