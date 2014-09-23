package binary_tree;

/**
 * Created by maksimustinov on 9/22/14.
 */
public class Problems {

    public static Problems inst(){
        return new Problems();
    }

    /**
     *
     * write a function for a BST to implement best case search.If exact search key not available in
     * BST then return best suited key.
     * Ex- if a tree has keys 21 15 26 30 55 7 and if my search key is 25
     * then this function should return 26.
     *
     */
    public void bstBestCaseSearch(){

        Node root = Node.insert(Node.create(21), 15, 26, 30, 55, 7);



        System.out.println("Searching for 55: " + search(root, null, 55));
        System.out.println("Searching for  1 : " + search(root, null, 1));
        System.out.println("Searching for 25 : " + search(root, null, 25));
    }

    private Node search(Node node, Node closest, int searchKey){

        if(node == null){
            return closest;
        }

        if(closest == null){
            closest = node;
        }
        if(node.getValue() == searchKey){
            return node;
        } else if(node.getLeftChildren() == null && node.getRightChildren() == null){
            return closest;
        }

        //if current node is closer the current closest node, reset the closest node

        if(Math.abs(node.getValue() - searchKey) < Math.abs(closest.getValue() - searchKey)){
            closest = node;
        }

        Node n;
        if(node.getRightChildren() != null && searchKey < node.getRightChildren().getValue()){
            n = search(node.getLeftChildren(), closest, searchKey);
        } else {
            n = search(node.getRightChildren(), closest, searchKey);
        }

        return n;
    }
}
