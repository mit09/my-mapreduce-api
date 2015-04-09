package api;

/**
 * Created by mit on 4/8/15.
 */
public interface MyWriteComparable<T> extends Comparable<T> {
    
    String getString();
    void deserialize(String ip);
}
