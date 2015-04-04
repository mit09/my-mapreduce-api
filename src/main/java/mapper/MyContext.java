package mapper;

import java.io.BufferedWriter;
import java.io.IOException;

/**
 * Created by mit and srikar on 4/3/15.
 */
public final class MyContext {
    private BufferedWriter bw;
    public MyContext(BufferedWriter bw){
        this.bw = bw;
        
    }
    
    //TODO:Key and value can be generics with Serializable
    public void write(String key, String value) throws IOException {
        bw.write(key+"\t"+value+"\n");
    }
}
