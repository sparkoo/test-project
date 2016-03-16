package cz.sparko.testproject;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Logging {
    private static final Logger log = LoggerFactory.getLogger(Logging.class);

    public static void main(String[] args) {
        log.debug("ahoj");
    }
}
