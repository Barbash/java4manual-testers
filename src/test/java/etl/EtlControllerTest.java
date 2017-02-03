package etl;

import etl.domain.*;
import etl.extractor.CsvFormatException;
import etl.extractor.IoProblemExtractor;
import org.junit.Test;

import static org.mockito.Mockito.*;

public class EtlControllerTest {
//    @Test(expected = EtlException.class, timeout = 1_000)
    public void shouldDoEtlOperationWhenNoIoProblem() throws EtlException, CsvFormatException {
        //region Given | Fixture
        final Extractor extractorStub = mock(Extractor.class);
        final User[] usersDummy = {
            new User(1, "user01"),
            new User(2, "user02")
        };
        when(extractorStub.extract()).thenReturn(usersDummy);

        final Loader loaderMock = mock(Loader.class);
        final EtlController etlController = new EtlController(
            extractorStub,
            new Loader[] { loaderMock }
        );
        //endregion

        //region When
        etlController.doEtl();
        //endregion

        //region Then
        verify(loaderMock, times(1)).load(usersDummy);
        //endregion
    }
}
