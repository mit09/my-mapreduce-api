package api;

import java.io.BufferedWriter;
import java.io.IOException;

/**
 * Created by mit and srikar on 4/3/15.
 */

/**
 * Writes data to BufferedWriter
 *
 * @param <K> Key Class which should extend {@link MyWriteComparable}
 * @param <V> Value Class which should extend {@link MyWriteComparable}
 */
public final class MyContext<K extends MyWriteComparable, V extends MyWriteComparable> {
    private BufferedWriter bw;

    public MyContext(BufferedWriter bw) {
        this.bw = bw;
    }

    /**
     * writes key and value to the buffered writer
     * <p/>
     * TODO:Key and value can be generics with Serializable
     *
     * @param key   key to write to the buffered writer
     * @param value value to write to the buffered writer
     * @throws IOException
     */
    public void write(K key, V value) throws IOException {
        bw.write(key.getString() + "\t" + value.getString() + "\n");
    }
}
