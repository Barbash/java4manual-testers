package com.db.edu.etl;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import static com.db.edu.etl.RecordType.valueOf;

public class Controller {
    private static final Logger logger = LoggerFactory.getLogger(Controller.class);

    public static String[] transform(RecordType recordType, String rawDataRecord) {
        return null;
    }

    public static String extract(RecordType recordType) {
        valueOf("EIS3");
        logger.debug("entering ");
        logger.debug("exit ");
        return null;
    }

    public static void load(String[] structureToSave) {
        //.....
    }

}
