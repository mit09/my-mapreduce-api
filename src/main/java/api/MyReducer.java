package api;

import java.util.Iterator;

/**
 * Created by mit on 4/9/15. Modified by Srikar
 */

/**
 * Definition of Reducer used for reducing input key and iterable list of
 * values pair to a set of key/value pairs
 *
 * @param <K> Key Class which should extend {@link MyWriteComparable}
 * @param <V> Value Class which should extend {@link MyWriteComparable}
 */
public interface MyReducer<K extends MyWriteComparable, V extends MyWriteComparable> {

    /**
     * reduces input key and iterable list of values to a set of
     * key/value pairs
     *
     * @param key       input key
     * @param value     list of iterable values
     * @param context   context object to write to file
     */
    void reduce(K key, Iterator<V> value, MyContext context);
}
