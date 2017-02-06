package etl;

import etl.domain.*;
import etl.extractor.CsvFormatException;
import etl.extractor.IoProblemExtractor;
import org.junit.Before;
import org.junit.Test;

import static org.mockito.Mockito.*;

public class EtlControllerTest {
    private EtlController etlController;
    private Loader loaderMock;
    private User[] usersDummy;

    @Before
    public void prepare() throws CsvFormatException {
        //region Given | Fixture
        final Extractor extractorStub = mock(Extractor.class);
        usersDummy = new User[]{
            new User(1, "user01"),
            new User(2, "user02")
        };
        when(extractorStub.extract()).thenReturn(usersDummy);

        this.loaderMock = mock(Loader.class);
        this.etlController = new EtlController(
            extractorStub,
            new Loader[] { loaderMock }
        );
        //endregion
    }

//    @Test(expected = EtlException.class, timeout = 1_000)
    public void shouldDoEtlOperationWhenNoIoProblem() throws EtlException, CsvFormatException {
        //region When
        this.etlController.doEtl();
        //endregion

        //region Then
        verify(loaderMock, times(1)).load(usersDummy);
        //endregion
    }

    public void fixtureBuilderDemo() {
        /*
        ExtractorStubBuilder
            .withDataSource(
                DataSourceStubBuilder
                    .withDataRecord("...")
                    .withDataRecord("...")
                    .withDataRecord("...")
                    .withDataRecord("...")
                    .withDataRecord("...")
                    .withDataRecord("...")
                .build())
            .withStringFormat("....")
            .build();
        */
    }
}
