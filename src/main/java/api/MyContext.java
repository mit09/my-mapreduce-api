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

    private final static String LINE_SEPERATOR = "\n";
    private final static String DEFAULT_KEY_VALUE_SEPARATOR = "\t";
    private BufferedWriter bw;
    private String keyValueSeparator;

    public MyContext(BufferedWriter bw) {
        this(bw, DEFAULT_KEY_VALUE_SEPARATOR);
    }

    public MyContext(BufferedWriter bw, String keyValueSeparator) {
        this.bw = bw;
        this.keyValueSeparator = keyValueSeparator;
    }

    /**
     * writes key and value to the buffered writer
     *
     * @param key   key to write to the buffered writer
     * @param value value to write to the buffered writer
     * @throws IOException
     */

    public void write(K key, V value) throws IOException {

        StringBuilder stringBuilder = new StringBuilder();

        stringBuilder.append(key.getString());
        stringBuilder.append(this.keyValueSeparator);
        stringBuilder.append(value.getString());
        stringBuilder.append(LINE_SEPERATOR);

        bw.write(stringBuilder.toString());
    }
}
