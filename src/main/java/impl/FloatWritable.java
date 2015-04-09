package impl;

import api.MyWriteComparable;

/**
 * Created by mit on 4/8/15.
 */
public class FloatWritable implements MyWriteComparable<Float> {

    private Float number;

    public FloatWritable(){}

    public FloatWritable(Float number){
        this.number = number;
    }
    
    @Override
    public String getString() {
        return this.number.toString();
    }
    
    @Override
    public void deserialize(String ip) throws NumberFormatException{
        this.number = Float.parseFloat(ip);
    }

    @Override
    public int compareTo(Float number2) {
        if(this.number == number2) return 0;
        if(this.number > number2) return 1;
        return -1;
    }

    public Float getNumber() {
        return number;
    }

    public void setNumber(Float number) {
        this.number = number;
    }
}
