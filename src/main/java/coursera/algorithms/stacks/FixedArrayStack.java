package coursera.algorithms.stacks;

import java.lang.reflect.Array;
import java.util.Arrays;

/**
 * Created by maksimustinov on 9/18/14.
 */
public class FixedArrayStack<T> implements Stack<T> {

    private T[] array;
    private int size;

    public FixedArrayStack(Class<T> clazz, int size){
        array = (T[]) Array.newInstance(clazz, size);
        this.size = size;
    }


    @Override
    public void push(T item) {
        array[size++] = item;
    }

    @Override
    public T pop() {
        return array[size--];
    }

    @Override
    public boolean isEmpty() {
        return false;
    }

    @Override
    public int size() {
        return 0;
    }
}
