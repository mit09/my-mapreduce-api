package impl;

/**
 * Created by mit on 4/9/15.
 */
public class WritableTest {
    
    public static void main(String[] args){
        IntWritable i1= new IntWritable(9);
        IntWritable i2 = new IntWritable(10);
        System.out.println(i1.compareTo(i2));
        
        FloatWritable f1 = new FloatWritable(14.13f);
        FloatWritable f2 = new FloatWritable(14.11f);
        System.out.println(f1.compareTo(f2));

        
        StringWritable s1 = new StringWritable("a");
        StringWritable s2 = new StringWritable("a");
        System.out.println(s1.compareTo(s2));

    }
}
