package localhost.batcher;

import localhost.batcher.utils.Batcher;
import localhost.batcher.utils.DataGetter;
import localhost.batcher.config.Config;

import java.util.List;

/**
 * Created by sasha on 19/02/16.
 */
public class BatcherRunner {
    public static void run() {
        List<String> resultOfBatch = Batcher.batchStringByNumber(DataGetter.getInput("string", Config.getDefaultInputString()),
                DataGetter.getInput("divider", Config.getDefaultInputNumber()));
        System.out.println("The result is: " + resultOfBatch);

    }
}
