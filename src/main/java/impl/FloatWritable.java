package impl;

import api.MyWriteComparable;

/**
 * Created by mit on 4/8/15. Modified by srikar
 */

/**
 * Float class Implementation of {@link MyWriteComparable} interface to be able
 * to use it either as a key/value in the framework.
 */

public class FloatWritable implements MyWriteComparable<FloatWritable> {

    private Float number;

    public FloatWritable() {
    }

    public FloatWritable(Float number) {
        this.number = number;
    }

    @Override
    public String getString() {
        return this.number.toString();
    }

    @Override
    public FloatWritable deserialize(String ip) throws NumberFormatException {
        this.number = Float.parseFloat(ip);
        return this;
    }

    @Override
    public int compareTo(FloatWritable number2) {
        return this.number.compareTo(number2.getNumber());
    }

    public Float getNumber() {
        return number;
    }

    public void setNumber(Float number) {
        this.number = number;
    }
}
