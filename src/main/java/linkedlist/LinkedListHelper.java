package linkedlist;

import java.util.List;

/**
 * Created by maksimustinov on 8/30/14.
 */
public class LinkedListHelper {

    public static ListElement insertInFront(ListElement headElement, Object data ){
                
        ListElement l = new ListElement( data );
        l.setNext(headElement);
        headElement = l;
        
        return headElement;
    }

    public static ListElement find(ListElement headElement, Object value){
        ListElement currElement = headElement;

        while(currElement != null && currElement.value() != value){
            currElement = currElement.getNext();
        }

        return currElement;
    }


    public static int sizeOfNext(ListElement headElement){
        int size = 0;

        ListElement currElement = headElement;

        while(currElement != null && currElement.getNext() != null){
            size++;
            currElement = currElement.getNext();
        }

        return size;
    }


    public static boolean delete(ListElement headElement, ListElement elementToRemove){

        if(headElement == null){
            return false;
        }

        ListElement currElement = headElement;

        /**
         * Special case to handle first element
         */
        if(headElement == elementToRemove){
            currElement = currElement.getNext();
            return true;
        }

        /**
         * Regular removal of non-head elements
         */
         while(currElement != null){

             if(currElement.getNext() == elementToRemove){
                 currElement.setNext(elementToRemove.getNext());
                 return true;
             }

             currElement = currElement.getNext();
         }


        /**
         * Element to remove was not found
         */
        return false;
    }

    /**
     * TODO: need to fix this
     * “PROBLEM Given a singly linked list, devise a time- and space-efficient
     * algorithm to find the mth-to-last element of the list.
     * Implement your algorithm, taking care to handle relevant error
     * conditions. Define mth to last such that when m = 0 the last element
     * of the list is returned.”
     * Excerpt From: Noah Kindler. “Programming Interviews Exposed.”
     * iBooks. https://itunes.apple.com/WebObjects/MZStore.woa/wa/viewBook?id=454DDAD36D7B5156322885BEAE13B948
     *
     * @return Mth element
     */
    public static ListElement findMthElement(ListElement headElement, int mthElementIndex){

        ListElement currElement = headElement;
        ListElement mthElement = null;

        int currIndex = 0;

        while(currElement != null){
            if((currIndex-mthElementIndex) >= mthElementIndex){
                mthElement = currElement;
            }

            currElement = currElement.getNext();
            currIndex++;
        }

        return mthElement;
    }

    /**
     * “PROBLEM You are given a linked list with at least one node that is either null-terminated (acyclic),
     * as shown in Figure 4-5, or ends in a cycle (cyclic), as shown in Figure 4-6.
     * Write a function that takes a pointer to the head of a list and determines whether the list is
     * cyclic or acyclic. Your function should return false if the list is acyclic and true if it is cyclic.
     * You may not modify the list in any way.”
     * Excerpt From: Noah Kindler. “Programming Interviews Exposed.” iBooks. https://itunes.apple.com/WebObjects/MZStore.woa/wa/viewBook?id=454DDAD36D7B5156322885BEAE13B948
     * @param headElement
     * @return
     */
    public static boolean nullOrCycle(ListElement headElement){
        return false;
    }

    public static void show(ListElement headElement){
        ListElement currElement = headElement;
        int index = 0;

        do{
            System.out.println(index++ + ") " + currElement + "-> " + currElement.getNext());

            currElement = currElement.getNext();
        } while(currElement != null);
    }
}
