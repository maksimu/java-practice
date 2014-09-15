package linkedlist;

/**
 * Created by maksimustinov on 8/30/14.
 */
public class ListElement<T> {

    private T data;
    private ListElement<T> nextElement;

    public ListElement(T data) {
        this.data = data;
    }

    public ListElement<T> getNext() {
        return nextElement;
    }

    public T value() {
        return data;
    }

    public void setNext(ListElement<T> nextElement) {
        this.nextElement = nextElement;
    }

    public void setValue(T value) {
        this.data = value;
    }

    @Override
    public String toString() {
        return this.getClass().getName() + "=[" + data + "]";
    }


}
