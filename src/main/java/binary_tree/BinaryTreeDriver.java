package binary_tree;

/**
 * Created by maksimustinov on 9/2/14.
 */
public class BinaryTreeDriver {

    public static void main(String... args){

        /*
         * Initialize tree
         */

        Node node4 = new Node(4, null, null);
        Node node7 = new Node(7, null, null);
        Node node13 = new Node(13, null, null);
        Node node1 = new Node(1, null, null);
        Node node6 = new Node(6, node4, node7);
        Node node14 = new Node(14, node13, null);
        Node node3 = new Node(3, node1, node6);
        Node node10 = new Node(10, node14, null);
        Node root8 = new Node(8, node3, node10);

        System.out.println(" Regular while loop search result   : " + NodeHelper.findNode(root8, 10).getValue());
        System.out.println(" Recursion search result            : " + NodeHelper.findNodeRecursively(root8, 10).getValue());



        /*
        Inserting root element
         */
        Node newRoot = null;

        NodeHelper nodeHelper = new NodeHelper();

        int newVal = 12;

        newRoot = nodeHelper.insert(newRoot, newVal);
        System.out.println(newRoot != null ? "Root value: " + newRoot.getValue() : "Hm, for some reason I was not able to insert a root");


        int newVal2 = 123;
        root8 = nodeHelper.insert(root8, newVal2);
        System.out.println(" Recursion search result            : " + NodeHelper.findNodeRecursively(root8, newVal2).getValue());

        int newVal3 = 123;
        Node root8_error_insertion = nodeHelper.insert(root8, newVal3);

        if(root8 == null){
            System.out.println("Was no able to insert");
        } else {
            System.out.println(" Recursion search result            : " + NodeHelper.findNodeRecursively(root8, newVal3).getValue());
        }


        nodeHelper.breadFistSearch(root8, 123);

    }
}
