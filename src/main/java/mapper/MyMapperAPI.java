package mapper;

import java.io.BufferedWriter;

/**
 * Created by mit on 4/2/15.
 */
public interface MyMapperAPI {
    
    void map(String line, MyContext context);
}
