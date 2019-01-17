package mh.java8.logger;

import java.util.Formatter;
import java.util.logging.*;

public class MyConsolLogger {

    public static void main(String[] args) {

        Logger log = Logger.getLogger("mh.java8.logger");
        Handler h = new ConsoleHandler();
        SimpleFormatter f = new SimpleFormatter();

        h.setFormatter(f);
        log.addHandler(h);

        log.setLevel(Level.ALL);

        log.log(Level.INFO,"Simple Test");


    }
}
