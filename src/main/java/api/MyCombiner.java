package api;

import java.util.Iterator;

/**
 * Created by mit and srikar on 4/18/15.
 */

/**
 * Definition of Combiner used for reducing input key and iterable list of
 * values pair to a set of key/value pairs
 *
 * @param <K> Key Class which should extend {@link MyWriteComparable}
 * @param <V> Value Class which should extend {@link MyWriteComparable}
 */

public interface MyCombiner<K extends MyWriteComparable, V extends MyWriteComparable> {

    /**
     * combines input key and iterable list of values to a set of
     * key/value pairs
     *
     * @param key     input key
     * @param value   list of iterable values
     * @param context context object to write to file
     */
    void reduce(K key, Iterator<V> value, MyContext context);
}
