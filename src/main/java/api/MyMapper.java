package api;

/**
 * Created by mit, srikar on 4/2/15.Modified by Amitash, Vishal
 */

/**
 * Definition of Mapper used for mapping input key/value pairs to a set of
 * intermediate key/value pairs
 *
 * @param <K> Key Class which should extend {@link MyWriteComparable}
 * @param <V> Value Class which should extend {@link MyWriteComparable}
 */
public interface MyMapper<K extends MyWriteComparable, V extends MyWriteComparable> {

    /**
     * process each line of input file and
     *
     * @param key     unique line identifier
     * @param value   single line of data from input file
     * @param context context object to write to file
     */
    void map(K key, V value, MyContext context);
}
