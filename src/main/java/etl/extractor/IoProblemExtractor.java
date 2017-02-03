package etl.extractor;

import etl.domain.Extractor;
import etl.domain.User;

public class IoProblemExtractor implements Extractor {
    @Override
    public User[] extract() throws CsvFormatException {
        //....
        if (true) throw new CsvFormatException("Illegal Format");
        return null;
        //.....
    }
}
