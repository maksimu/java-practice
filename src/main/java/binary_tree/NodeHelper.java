package binary_tree;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

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
     * Height of a Tree
     * 
     * PROBLEM: The height of a tree (binary or not) is defined to be the maximum distance from the root node to any
     * leaf node. The tree in Figure 5-2, for example, has a height of 4 because the path from A to F, G, or H involves
     * four nodes. Write a function to calculate the height of an arbitrary binary tree.
     *
     * Complexity: O(n) - because every node will be called once and the time to call each node is constant
     *
     * Excerpt From: Noah Kindler. “Programming Interviews Exposed.” iBooks. https://itunes.apple.com/WebObjects/MZStore.woa/wa/viewBook?id=454DDAD36D7B5156322885BEAE13B948
     */
    public int heightOfATree(Node node) {

        if (node == null) {
            return 0;
        }

        int leftVal = heightOfATree(node.getLeftChildren());
        int rightVal = heightOfATree(node.getRightChildren());

        int higherVal = leftVal > rightVal ? leftVal : rightVal;

        return 1 + higherVal; // need to add ONE for a root element
    }


    /**
     * “Traversals
     * 
     * Another common type of tree problem is called a traversal. A traversal is just like a search, except that instead
     * of stopping when you find a particular target node, you visit every node in the tree. Often this is used to
     * perform some operation on each node in the tree. There are many types of traversals, each of which visits nodes
     * in a different order, but you’re most likely to be asked about the three most common types of depth-first
     * traversals for binary trees:
     *
     * Preorder — Performs the operation
     *      1) first on the node itself,
     *      2) then on its left descendants,
     *      3) and finally on its right descendants.
     *
     *      In other words, a node is always visited before any of its children.
     *
     * Inorder — Performs the operation
     *      1) first on the node’s left descendants,
     *      2) then on the node itself,
     *      3) and finally on its right descendants.
     *
     *      In other words, the left subtree is visited first, then the node itself,
     *      and then the node’s right subtree.
     *
     * Postorder — Performs the operation
     *      1) first on the node’s left descendants,
     *      2) then on the node’s right descendants,
     *      3) and finally on the node itself.
     *
     *      In other words, a node is always visited after all its children.
     *
     * These classes of traversals can also apply to nonbinary trees as long as you have a way to classify whether a
     * child is “less than” (on the left of) or “greater than” (on the right of) its parent node.
     *
     * Recursion is usually the simplest way to implement a depth-first traversal.”
     * 
     * Excerpt From: Noah Kindler. “Programming Interviews Exposed.” iBooks. https://itunes.apple.com/WebObjects/MZStore.woa/wa/viewBook?id=454DDAD36D7B5156322885BEAE13B948
     */


    /**
     * Preorder — Performs the operation
     *      1) first on the node itself,
     *      2) then on its left descendants,
     *      3) and finally on its right descendants.
     *
     *      In other words, a node is always visited before any of its children.
     *
     * Performance: O(n) - each node visited only once
     *
     * @param node
     */
    public void traversalPreOrder(Node node) {

        if(node == null){
            return;
        }

        node.print();
        traversalPreOrder(node.getLeftChildren());
        traversalPreOrder(node.getRightChildren());
    }


    /**
     * Inorder — Performs the operation
     *      1) first on the node’s left descendants,
     *      2) then on the node itself,
     *      3) and finally on its right descendants.
     *
     *      In other words, the left subtree is visited first, then the node itself,
     *      and then the node’s right subtree.
     *
     * Performance: O(n) - each node visited only once
     *
     * @param node
     */
    public void traversalInOrder(Node node) {
        if(node == null){
            return;
        }

        traversalInOrder(node.getLeftChildren());
        node.print();
        traversalInOrder(node.getRightChildren());

    }


    /**
     * Postorder — Performs the operation
     *      1) first on the node’s left descendants,
     *      2) then on the node’s right descendants,
     *      3) and finally on the node itself.
     *
     *      In other words, a node is always visited after all its children.
     *
     * Performance: O(n) - each node visited only once
     * @param node
     */
    public void traversalPostOrder(Node node) {
        if(node == null){
            return;
        }

        traversalPostOrder(node.getLeftChildren());
        traversalPostOrder(node.getRightChildren());
        node.print();
    }


    /**
     * Preorder Traversal, No Recursion
     *
     * PROBLEM Perform a preorder traversal of a binary search tree, printing the value of each node, but this time
     * you may not use recursion.
     *
     * Excerpt From: Noah Kindler. “Programming Interviews Exposed.” iBooks. https://itunes.apple.com/WebObjects/MZStore.woa/wa/viewBook?id=454DDAD36D7B5156322885BEAE13B948
     *
     * @param node
     */
    public void traversalPreOrder_nonrecursion(Node node){

        Stack<Node> stack = new Stack<Node>();

        stack.push(node);

        while(stack.size() > 0){
            node.print();
            if(node.getRightChildren() != null) stack.push(node.getRightChildren());
            if(node.getLeftChildren() != null) stack.push(node.getLeftChildren());
        }
    }

    /**
     * Binary Tree to Heap
     *
     * PROBLEM You are given a set of integers in an unordered binary tree. Use an array sorting routine to transform
     * the tree into a heap that uses a balanced binary tree as its underlying data structure.
     *
     * Excerpt From: Noah Kindler. “Programming Interviews Exposed.” iBooks. https://itunes.apple.com/WebObjects/MZStore.woa/wa/viewBook?id=454DDAD36D7B5156322885BEAE13B948
     */

    public void binaryTreeToHeap(){
        // need to implement
    }

}
