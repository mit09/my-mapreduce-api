package impl;

import api.MyWriteComparable;

/**
 * Created by mit on 4/8/15. Modified by srikar
 */

/**
 * String class Implementation of {@link MyWriteComparable} interface to be able
 * to use it either as a key/value in the framework.
 */
public class StringWritable implements MyWriteComparable<StringWritable> {

    private String str;

    public StringWritable() {
    }

    public StringWritable(String str) {
        this.str = str;
    }

    @Override
    public String getString() {
        return this.str;
    }

    @Override
    public StringWritable deserialize(String ip) {
        this.str = ip;
        return this;
    }

    @Override
    public int compareTo(StringWritable string2) {
        return this.getString().compareTo(string2.getString());
    }

    public String getStr() {
        return str;
    }

    public void setStr(String str) {
        this.str = str;
    }
}
