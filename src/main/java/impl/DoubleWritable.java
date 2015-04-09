package impl;

import api.MyWriteComparable;

/**
 * Created by mit on 4/8/15. Modified by srikar
 */

/**
 * Double class Implementation of {@link MyWriteComparable} interface to be able
 * to use it either as a key/value in the framework.
 */
public class DoubleWritable implements MyWriteComparable<DoubleWritable> {

    private Double number;

    public DoubleWritable() {
    }

    public DoubleWritable(Double number) {
        this.number = number;
    }

    @Override
    public String getString() {
        return this.number.toString();
    }

    @Override
    public DoubleWritable deserialize(String ip) throws NumberFormatException {
        this.number = Double.parseDouble(ip);
        return this;
    }

    @Override
    public int compareTo(DoubleWritable number2) {
        return this.number.compareTo(number2.getNumber());
    }

    public Double getNumber() {
        return number;
    }

    public void setNumber(Double number) {
        this.number = number;
    }
}
