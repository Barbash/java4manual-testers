package etl;

import etl.domain.EtlController;
import etl.domain.EtlException;
import etl.domain.Loader;
import etl.extractor.IoProblemExtractor;

public class EtlTest {
    public static void main(String[] args) throws TestFailException {
        try {

            new EtlController(
                new IoProblemExtractor(),
                new Loader[] {}
            ).doEtl();

        } catch (EtlException e) {
            return;
        }

        throw new TestFailException(); //fail();
    }
}
