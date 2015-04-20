package api;

/**
 * Created by srikar on 4/20/15.
 */

/**
 * Job Configuration to be set by the client
 */
public class JobConf {

    private static String mapperClassName;
    private static String reducerClassName;
    private static String combinerClassName;
    private static String mapKeyInputClassName;
    private static String mapValueInputClassName;
    private static String mapKeyOutputClassName;
    private static String mapValueOutputClassName;
    private static String reduceKeyOutputClassName;
    private static String reduceValueOutputClassName;
    private static String inputFilePath;
    private static String outputFilePath;
    private static boolean isCombinerSet = false;
    private static int numReducers = 1;

    public void initialize(){
        System.out.println("Hey");
    }

    public static String getMapperClassName() {
        return mapperClassName;
    }

    public static void setMapperClassName(String mapperClassName) {
        JobConf.mapperClassName = mapperClassName;
    }

    public static String getReducerClassName() {
        return reducerClassName;
    }

    public static void setReducerClassName(String reducerClassName) {
        JobConf.reducerClassName = reducerClassName;
    }

    public static String getCombinerClassName() {
        return combinerClassName;
    }

    public static void setCombinerClassName(String combinerClassName) {
        JobConf.combinerClassName = combinerClassName;
    }

    public static String getMapKeyInputClassName() {
        return mapKeyInputClassName;
    }

    public static void setMapKeyInputClassName(String mapKeyInputClassName) {
        JobConf.mapKeyInputClassName = mapKeyInputClassName;
    }

    public static String getMapValueInputClassName() {
        return mapValueInputClassName;
    }

    public static void setMapValueInputClassName(String mapValueInputClassName) {
        JobConf.mapValueInputClassName = mapValueInputClassName;
    }

    public static String getMapKeyOutputClassName() {
        return mapKeyOutputClassName;
    }

    public static void setMapKeyOutputClassName(String mapKeyOutputClassName) {
        JobConf.mapKeyOutputClassName = mapKeyOutputClassName;
    }

    public static String getMapValueOutputClassName() {
        return mapValueOutputClassName;
    }

    public static void setMapValueOutputClassName(String mapValueOutputClassName) {
        JobConf.mapValueOutputClassName = mapValueOutputClassName;
    }

    public static String getReduceKeyOutputClassName() {
        return reduceKeyOutputClassName;
    }

    public static void setReduceKeyOutputClassName(String reduceKeyOutputClassName) {
        JobConf.reduceKeyOutputClassName = reduceKeyOutputClassName;
    }

    public static String getReduceValueOutputClassName() {
        return reduceValueOutputClassName;
    }

    public static void setReduceValueOutputClassName(String reduceValueOutputClassName) {
        JobConf.reduceValueOutputClassName = reduceValueOutputClassName;
    }

    public static String getInputFilePath() {
        return inputFilePath;
    }

    public static void setInputFilePath(String inputFilePath) {
        JobConf.inputFilePath = inputFilePath;
    }

    public static String getOutputFilePath() {
        return outputFilePath;
    }

    public static void setOutputFilePath(String outputFilePath) {
        JobConf.outputFilePath = outputFilePath;
    }

    public static boolean isIsCombinerSet() {
        return isCombinerSet;
    }

    public static void setIsCombinerSet(boolean isCombinerSet) {
        JobConf.isCombinerSet = isCombinerSet;
    }

    public static int getNumReducers() {
        return numReducers;
    }

    public static void setNumReducers(int numReducers) {
        JobConf.numReducers = numReducers;
    }
}
