package api;

import java.util.Iterator;

/**
 * Created by mit on 4/9/15.
 */
public interface MyReducer<K extends MyWriteComparable, V extends MyWriteComparable> {
    void reduce(K key, Iterator<V> value, MyContext context);
}
