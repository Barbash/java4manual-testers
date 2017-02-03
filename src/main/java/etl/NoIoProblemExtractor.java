package etl;

import etl.domain.Extractor;
import etl.domain.User;
import etl.extractor.CsvFormatException;

public class NoIoProblemExtractor implements Extractor {
    @Override
    public User[] extract() throws CsvFormatException {
        return new User[] {
            new User(1, ""),
            new User(2, "")
        };
    }
}
