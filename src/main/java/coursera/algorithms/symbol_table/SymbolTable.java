package coursera.algorithms.symbol_table;

/**
 * Created by maksimustinov on 9/30/14.
 *
 * Conventions:
 *  - Values are not null
 *  - Method get() will return null if key is not present
 *  - Method put() overrides old value with the new value
 */
public interface SymbolTable<Key extends Comparable<Key>, Value> {

    public void put(Key key, Value value);
    public Value get(Key key);
    public boolean contain(Key key);
    public void delete(Key key);
    public boolean isEmpty();
    public int size();
    public Iterable<Key> keys();
}
