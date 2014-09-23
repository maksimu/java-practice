package binary_tree;

/**
 * Created by maksimustinov on 9/1/14.
 */
public class Node {
    private int value;
    private Node leftChildren;
    private Node rightChildren;


    public Node(int value, Node leftChildren, Node rightChildren){
        this.value = value;
        this.leftChildren = leftChildren;
        this.rightChildren = rightChildren;
    }




    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    public Node getLeftChildren() {
        return leftChildren;
    }

    public void setLeftChildren(Node leftChildren) {
        this.leftChildren = leftChildren;
    }

    public Node getRightChildren() {
        return rightChildren;
    }

    public void setRightChildren(Node rightChildren) {
        this.rightChildren = rightChildren;
    }

    /**
     * Insert new value into this Node.
     *
     * There are three main conditions in this method:
     *      1. IF key is already present then don't insert it and return false
     *
     *      2. IF key is > than current value then insert it to the right side
     *          2a. IF right side is null then create new empty node and insert it. Return true
     *          2b. ELSE get right node and call same insert function (recursion) to insert this key. Return value from the insert method
     *
     *      3. ELSE IF key is < than current value then insert it to to left side
     *          3a. IF right side is null then create new empty node and insert it. Return true
     *          3b. ELSE get right node and call same insert function (recursion) to insert this key. Return value from the insert method
     *
     * @param key
     * @return
     */
    public boolean insert(int key){

        /*
         * 1. Taking care of the duplicate.
         * IF key is already present then don't insert it and return false
         */
        if(key == this.getValue()){
            return false;
        }

        /*
         *      2. IF key is > than current value then insert it to the right side
         *          2a. IF right side is null then create new empty node and insert it. Return true
         *          2b. ELSE get right node and call same insert function (recursion) to insert this key. Return value from the insert method
         */
        if(key > this.getValue()){
            if(this.getRightChildren() == null){
                this.setRightChildren(new Node(key, null, null));
                return true;
            } else {
                return this.getRightChildren().insert(key);
            }
        }

        /*
         *      3. ELSE IF key is < than current value then insert it to to left side
         *          3a. IF right side is null then create new empty node and insert it. Return true
         *          3b. ELSE get right node and call same insert function (recursion) to insert this key. Return value from the insert method
         */
        else {
            if(this.getLeftChildren() == null){
                this.setLeftChildren(new Node(key, null, null));
                return true;
            } else {
                return this.getLeftChildren().insert(key);
            }
        }
    }

    /**
     * Create a node with a give key. Both of its children will be nulled
     *
     * @param key Key to use in creation of a Node
     * @return Created Node with a give key
     */
    public static Node create(int key){
        Node n = new Node(key, null, null);
        return n;
    }

    /**
     * Helper method that helps to insert multiple keys into a given node
     * @param root Root node
     * @param keys Var arg of keys
     * @return Provided root node with the inserted keys as Nodes
     */
    public static Node insert(Node root, int... keys){

        for(int k : keys){
            root.insert(k);
        }

        return root;
    }

    @Override
    public String toString(){
        return "[" + this.getValue() + "]";
    }

    public void print(){
        System.out.println(this.toString());
    }
}
