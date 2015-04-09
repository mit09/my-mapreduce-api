package api;

/**
 * Created by mit, srikar, vishal on 4/8/15. Modified by Amitash
 */

/**
 * Definition for implementing various input/output types used in the
 * framework which perform serialization and deserialization of data.
 * Any type which need to be used as a key or value should extend this
 * interface.
 *
 * @param <T> Type of object which implements this interface
 */
public interface MyWriteComparable<T> extends Comparable<T> {

    /**
     * Serializes the data
     *
     * @return string representation of the serialized data
     */
    String getString();

    /**
     * Deserialize the data
     *
     * @param input serialized input data
     * @return MyWriteComparable object after deserializing the data
     */
    MyWriteComparable deserialize(String input);
}