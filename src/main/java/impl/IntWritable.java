package impl;

import api.MyWriteComparable;

/**
 * Created by mit on 4/8/15. Modified by srikar
 */

/**
 * Integer class Implementation of {@link MyWriteComparable} interface to be able
 * to use it either as a key/value in the framework.
 */

public class IntWritable implements MyWriteComparable<IntWritable> {

    private Integer number;

    public IntWritable() {
    }

    public IntWritable(Integer number) {
        this.number = number;
    }

    @Override
    public String getString() {
        return this.number.toString();
    }

    @Override
    public IntWritable deserialize(String ip) {
        this.number = Integer.parseInt(ip);
        return this;
    }

    @Override
    public int compareTo(IntWritable number2) {
        return this.number.compareTo(number2.getNumber());
    }

    public Integer getNumber() {
        return number;
    }

    public void setNumber(Integer number) {
        this.number = number;
    }
}
