package etl.domain;


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
        Connection connection = null;
        try {
            connection = null; //getConnection();
            //.....
        } catch (RuntimeException e) {
            throw new EtlException("Etl problem, don't panic!!!", e, 5);
        } catch (Exception e) {

        } finally {
            if(connection != null) try {
                connection.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }
}
