package localhost.batcher.utils;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by sasha on 18/02/16.
 */
public class DataGetter {

    public static String getInput(String inputName, String defaultValue) {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter your " +inputName+ " (default: " +defaultValue+ "): ");
        String input = null;
        try {
            input = br.readLine();
        }
        catch (IOException e) {
            e.printStackTrace();
        }
        if (input.equals("")) {
            return defaultValue;
        }
        else {
            return input;
        }

    }

    public static int getInput(String inputName, int defaultValue) {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter your " +inputName+ " (default: " +defaultValue+ "): ");
        String input = null;
        try {
            input = br.readLine();
        }
        catch (IOException e) {
            e.printStackTrace();
        }
        if (input.equals("") ) {
            return defaultValue;
        }
        else {
            return Integer.valueOf(input);
        }

    }
    
}
