package impl;

import api.MyWriteComparable;

/**
 * Created by mit on 4/8/15. Modified by srikar
 */

/**
 * Long class Implementation of {@link MyWriteComparable} interface to be able
 * to use it either as a key/value in the framework.
 */
public class LongWritable implements MyWriteComparable<LongWritable> {

    private Long number;

    public LongWritable() {
    }

    public LongWritable(Long number) {
        this.number = number;
    }

    @Override
    public String getString() {
        return this.number.toString();
    }

    @Override
    public LongWritable deserialize(String ip) throws NumberFormatException {
        this.number = Long.parseLong(ip);
        return this;
    }

    @Override
    public int compareTo(LongWritable number2) {
        return this.number.compareTo(number2.getNumber());
    }

    public Long getNumber() {
        return number;
    }

    public void setNumber(Long number) {
        this.number = number;
    }
}
