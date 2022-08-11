package au.com.mayi.geoscape.batches;

import au.com.mayi.geoscape.enums.RequestType;
import au.com.mayi.geoscape.model.ApiRes;
import au.com.mayi.geoscape.model.Input;
import au.com.mayi.geoscape.model.Output;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.io.IOException;
import java.net.InetSocketAddress;
import java.net.Proxy;

import static org.junit.jupiter.api.Assertions.*;

class SubmitBatchApiTest {
    private static Proxy proxy;
    private SubmitBatchApi submitBatchApi;

    @BeforeAll
    public static void beforeAll() {
        if (System.getProperty("https.proxyHost") != null) {
            proxy = new Proxy(Proxy.Type.HTTP, new InetSocketAddress(System.getProperty("https.proxyHost"), Integer.parseInt(System.getProperty("https.proxyPort"))));
        }
    }

    @BeforeEach
    public void beforeEach() {
        submitBatchApi = new SubmitBatchApi("https://api.psma.com.au", "consumerKey", proxy);
    }

    @Test
    void shouldExecute() throws IOException {
        final BatchReq batchReq = new BatchReq();
        final Input input = new Input();
        input.setFile("ftp://localhost:8821/outbound/test/");
        input.setPassword("password");
        input.setUsername("batch-test");
        batchReq.setInput(input);

        final Output output = new Output();
        output.setFile("ftp://localhost:8821/inbound/test/");
        output.setPassword("password");
        output.setUsername("aec-batch-test");
        batchReq.setOutput(output);
        batchReq.setType(RequestType.addressGeocoder);

        final ApiRes<BatchRes> res = submitBatchApi.execute(batchReq);

        assertNotNull(res);
        assertEquals(200, res.getCode());
        assertNotNull(res.getBody());
    }
}