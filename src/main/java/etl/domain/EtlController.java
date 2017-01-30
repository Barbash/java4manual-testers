package etl.domain;


import java.io.IOException;
import java.io.InputStream;
import java.sql.Connection;
import java.sql.SQLException;

public class EtlController {
    private Extractor extractor;
    private Loader[] loaders;

    public EtlController(Extractor extractor, Loader[] loaders) {
        this.extractor = extractor;
        this.loaders = loaders;
    }

    public void doEtl() throws EtlException {
        try (
            Connection connection = null /* getConnection() */;
            InputStream is = null;
        ) {
            //.....
        } catch (SQLException | IOException e) {
            throw new EtlException("Etl problem, don't panic!!!", e, 5);
        }
    }
}
