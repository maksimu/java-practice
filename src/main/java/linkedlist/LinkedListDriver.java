package linkedlist;

import sun.awt.X11.ListHelper;

/**
 * Created by maksimustinov on 8/31/14.
 */
public class LinkedListDriver {



    public static void main(String... args){


        ListElement head = new ListElement<String>("a");
        ListElement<String> listElement2 = new ListElement<String>("b");
        ListElement<String> listElement3 = new ListElement<String>("c");
        ListElement<String> listElement4 = new ListElement<String>("d");
        ListElement<String> listElement5 = new ListElement<String>("e");
        ListElement<String> listElement6 = new ListElement<String>("f");

        head.setNext(listElement2);
        listElement2.setNext(listElement3);
        listElement3.setNext(listElement4);
        listElement4.setNext(listElement5);
        listElement5.setNext(listElement6);


        LinkedListHelper.show(head);
        ListElement a = LinkedListHelper.find(head, "z");
        if(a != null){
            System.out.println("Found : " + a.value());
        } else {
            System.out.println("Nothing found");
        }

        System.out.println("Inserting 'z' to the front...");
        head = LinkedListHelper.insertInFront(head, "z");

        LinkedListHelper.show(head);


        /*
         * Deleting
         */
        System.out.println("Total elements in head: " + LinkedListHelper.sizeOfNext(head));
        ListElement elementToRemove = listElement2;
        System.out.println("Removing first element" + elementToRemove);
        LinkedListHelper.delete(head, elementToRemove);
        LinkedListHelper.show(head);
        System.out.println("Total elements in head: " + LinkedListHelper.sizeOfNext(head));


        /*
         * Find Mth element
         */
        int mthElementIndex = 2;

        System.out.println("\n\nFinding [" + mthElementIndex + "]th element.");
        ListElement mthElement = LinkedListHelper.findMthElement(head, mthElementIndex);
        System.out.println("Found [" + mthElement + "]");

    }
}
