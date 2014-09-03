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

    public boolean insert(int key){

        /*
        Taking care of the duplicate
         */
        if(key == this.getValue()){
            return false;
        }

        if(key > this.getValue()){
            if(this.getRightChildren() == null){
                this.setRightChildren(new Node(key, null, null));
                return true;
            } else {
                return this.getRightChildren().insert(key);
            }
        } else {
            if(this.getLeftChildren() == null){
                this.setLeftChildren(new Node(key, null, null));
                return true;
            } else {
                return this.getLeftChildren().insert(key);
            }
        }
    }
}
