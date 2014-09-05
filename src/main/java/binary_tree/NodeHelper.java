package binary_tree;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by maksimustinov on 9/1/14.
 */
public class NodeHelper {

    public static Node findNode(Node node, int key) {

        while (node != null) {

            if (node.getValue() == key) {
                return node;
            }

            if (node.getValue() < key) {
                node = node.getRightChildren();
            } else {
                node = node.getLeftChildren();
            }
        }

        return node;
    }

    public static Node findNodeRecursively(Node node, int key) {

        if (node == null) {
            return null;
        }

        int currentValue = node.getValue();

        if (currentValue == key) {
            return node;
        }

        if (currentValue < key) {
            return findNodeRecursively(node.getRightChildren(), key);
        } else {
            return findNodeRecursively(node.getLeftChildren(), key);
        }
    }

    Node root; // needed to perform task on this, since there are no pass-by-reference in Java :(

    /**
     * Insert a new node for a given key into a given root node. Will create a new root node
     *
     * @param r   Root node
     * @param key key to insert
     * @return Root node
     */
    public Node insert(Node r, int key) {

        root = r;

        /*
        Take care of the root element. If this tree is a new one then we need to initiate it.
         */
        if (root == null) {
            root = new Node(key, null, null);
        } else {
            return root.insert(key) ? root : null;
        }

        return root;
    }


    /**
     * Search: Breadth-First Search (BFS)
     */
    public Node breadFistSearch(Node root, int key) {

        List<Node> queue = new ArrayList<Node>();

        queue.add(root);

        while (queue.size() > 0) {

            List<Node> tempQueue = new ArrayList<Node>();
            for (Node n : queue) {
                System.out.print(n);

                if (n != null) {
                    if (n.getValue() == key) {
                        System.out.print(" <-- Found");
                        return n;
                    }

                    tempQueue.add(n.getLeftChildren());
                    tempQueue.add(n.getRightChildren());
                }
            }

            queue.clear();

            for (Node n : tempQueue) {
                queue.add(n);
            }

            System.out.println();
        }

        return null;
    }


    /**
     * Search: Depth-First Search (DFS)
     *
     * Complexity: O(n) - Can visit all the nodes in the worst case
     */

    public Node depthFirstSearch(Node node, int key) {

        System.out.println(" *** in " + node);
        if (node == null) {
            return null;
        }

        if (node.getValue() == key) {
            return node;
        } else {

            Node child = null;

            if (node.getLeftChildren() != null && key < node.getLeftChildren().getValue()) {
                child = depthFirstSearch(node.getLeftChildren(), key);

            } else if (node.getRightChildren() != null) {
                child = depthFirstSearch(node.getRightChildren(), key);
            }

            if (child != null) {
                return child;
            }

        }

        return null;
    }


    /**
     * “PROBLEM Informally, a preorder traversal involves walking around the tree in a counter-clockwise manner
     * starting at the root, sticking close to the edges, and printing out the nodes as you encounter them.
     * For the tree shown in Figure 5-6, the result is 100, 50, 25, 75, 150, 125, 110, and 175. Perform a
     * preorder traversal of a binary search tree, printing the value of each node.”
     * <p/>
     * Excerpt From: Noah Kindler. “Programming Interviews Exposed.” iBooks. https://itunes.apple.com/WebObjects/MZStore.woa/wa/viewBook?id=454DDAD36D7B5156322885BEAE13B948
     */
    public void traversalPreOrder() {

    }


    public void traversalInOrder() {

    }

    public void traversalPostOrder() {

    }
}
