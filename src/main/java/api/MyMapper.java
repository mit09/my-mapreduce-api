package api;

/**
 * Created by mit on 4/2/15.
 */
public interface MyMapper<K extends MyWriteComparable, V extends MyWriteComparable> {
    
    void map(K key, V value, MyContext context);
}
