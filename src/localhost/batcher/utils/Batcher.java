package localhost.batcher.utils;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by sasha on 18/02/16.
 */
public class Batcher {

    public static List<String> batchStringByNumber(String inputString, int number) {
        List<String> listOfStrings = new ArrayList<>();
        int index = 0;

        if (inputString != null && number != 0) {
            while (index < inputString.length()) {
                listOfStrings.add(inputString.substring(index, Math.min(index + number, inputString.length())));
                index += number;
            }
        }

        return listOfStrings;
    }

}
