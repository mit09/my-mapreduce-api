package api;

import java.io.BufferedWriter;
import java.io.IOException;

/**
 * Created by mit and srikar on 4/3/15.
 */
public final class MyContext<V extends MyWriteComparable> {
    private BufferedWriter bw;
    public MyContext(BufferedWriter bw){
        this.bw = bw;
        
    }
    
    //TODO:Key and value can be generics with Serializable
    public void write(String key, V value) throws IOException {
        bw.write(key+"\t"+value.getString()+"\n");
    }
}
