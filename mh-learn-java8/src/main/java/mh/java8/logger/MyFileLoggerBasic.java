package mh.java8.logger;

import java.io.IOException;
import java.util.logging.FileHandler;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.logging.SimpleFormatter;

public class MyFileLoggerBasic {
    public static void main(String[] args) throws IOException {
        Logger logger = Logger.getLogger("mh.java8.logger");

        FileHandler fh = new FileHandler("/var/tmp/myapp_%g.log",1000,2);

        fh.setFormatter(new SimpleFormatter());



        logger.addHandler(fh);
        logger.setLevel(Level.INFO);
        logger.log(Level.INFO,"Message for File");

    }
}
