package mh.java8.logger;


import java.util.logging.Level;
import java.util.logging.LogManager;
import java.util.logging.Logger;

public class MyLoggerMain {

    static Logger lm =  LogManager.getLogManager().getLogger(Logger.GLOBAL_LOGGER_NAME);

    public static void main(String[] args) {

        lm.setLevel(Level.INFO);

        lm.entering("mh.java8.logger.MyLoggerMain","main","Start of Logging ...");
        lm.log(Level.INFO,"My First Logging by {0}","Manjunath");
        lm.exiting("mh.java8.logger.MyLoggerMain","main","Done of Logging ...");
    }
}
