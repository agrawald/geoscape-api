package au.com.mayi.geoscape.batches;

import au.com.mayi.geoscape.model.ApiRes;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.io.IOException;
import java.net.InetSocketAddress;
import java.net.Proxy;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

class ListBatchApiTest {
    private static Proxy proxy;
    private ListBatchApi listBatchApi;

    @BeforeAll
    public static void beforeAll() {
        if (System.getProperty("https.proxyHost") != null) {
            proxy = new Proxy(Proxy.Type.HTTP, new InetSocketAddress(System.getProperty("https.proxyHost"), Integer.parseInt(System.getProperty("https.proxyPort"))));
        }
    }

    @BeforeEach
    public void beforeEach() {
        listBatchApi = new ListBatchApi("https://api.psma.com.au", "pHshAX3bvGGnYPeIUAXOWyLQOaHUkzr5", proxy);
    }

    @Test
    void shouldExecute() throws IOException {
        final ApiRes<BatchRes[]> res = listBatchApi.execute();

        assertNotNull(res);
        assertEquals(200, res.getCode());
        assertNotNull(res.getBody());
    }
}