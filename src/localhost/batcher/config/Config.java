package localhost.batcher.config;

/**
 * Created by sasha on 18/02/16.
 */
public class Config {

    private static String defaultInputString = "123456789";
    private static int defaultInputNumber = 4;

    public static String getDefaultInputString() {
        return defaultInputString;
    }

    public static int getDefaultInputNumber() {
        return defaultInputNumber;
    }

}
