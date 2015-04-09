package impl;

import api.MyWriteComparable;

/**
 * Created by mit on 4/8/15.
 */
public class StringWritable implements MyWriteComparable<String> {

    private String str;

    public StringWritable(){}

    public StringWritable(String str){
        this.str = str;
    }
    
    @Override
    public String getString() {
        return this.str.toString();
    }
    
    @Override
    public void deserialize(String ip){
        this.str = ip;
    }

    @Override
    public int compareTo(String string2) {
        return string2.compareTo(this.str);
    }

    public String getStr() {
        return str;
    }

    public void setStr(String str) {
        this.str = str;
    }
}
