package impl;

import api.MyWriteComparable;

/**
 * Created by mit on 4/8/15.
 */
public class IntWritable implements MyWriteComparable<Integer> {

    private Integer number;
    
    public IntWritable(){}
    
    public IntWritable(Integer number){
        this.number = number;
    }
    
    @Override
    public String getString() {
        return this.number.toString();
    }
    
    @Override
    public void deserialize(String ip){
        this.number = Integer.parseInt(ip);
    }

    @Override
    public int compareTo(Integer number2) {
        if(this.number == number2) return 0;
        if(this.number > number2) return 1;
        return -1;
    }

    public Integer getNumber() {
        return number;
    }

    public void setNumber(Integer number) {
        this.number = number;
    }
}
