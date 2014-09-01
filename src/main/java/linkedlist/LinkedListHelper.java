package linkedlist;

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

    public static boolean delete(ListElement headElement, ListElement elementToRemove){

        if(headElement == null){
            return false;
        }

        ListElement currElement = headElement;

        /**
         * Special case to handle first element
         */
        if(headElement == elementToRemove){

        }




    }

    public static void show(ListElement headElement){
        ListElement currElement = headElement;
        do{
            System.out.println(currElement.value());

            currElement = currElement.getNext();
        } while(currElement != null);
    }
}
