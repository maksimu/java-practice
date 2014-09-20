package coursera.algorithms.stacks;

/**
 * Created by maksimustinov on 9/18/14.
 */
public interface Stack<T> {

    public void push(T item);
    public T pop();
    public boolean isEmpty();
    public int size();
}
