package org.moita;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class App {

    private final static Logger LOGGER = LogManager.getLogger(App.class.getName()); //instance of Logger class
    private int result = 0;

    public int div(int num1, int num2) throws Exception {
        LOGGER.trace("Starting division");  //logging level = trace
        LOGGER.info("Numbers being divided: " + num1 + " and " + num2); //logging level = info

        if (num2 == 0) {
            LOGGER.error("It is not possible to divide any number by zero"); //logging level = error
            throw new Exception("ERROR MSG");

        } else {
            result = num1 / num2;
            LOGGER.trace("Division done");
            LOGGER.info("Result is: " + result);
        }
        return result;
    }

    public static void main(String[] args) {
        App test = new App();
        try {
            test.div(10,0);
//            test.div(10,5);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
