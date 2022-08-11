package au.com.mayi.geoscape.address.verification;

import au.com.mayi.geoscape.model.ApiRes;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.io.IOException;
import java.net.InetSocketAddress;
import java.net.Proxy;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

class VerificationApiTest {
    private static Proxy proxy;
    private VerificationApi geocoderApi;

    @BeforeAll
    public static void beforeAll() {
        if (System.getProperty("https.proxyHost") != null) {
            proxy = new Proxy(Proxy.Type.HTTP, new InetSocketAddress(System.getProperty("https.proxyHost"), Integer.parseInt(System.getProperty("https.proxyPort"))));
        }
    }

    @BeforeEach
    public void beforeEach() {
        geocoderApi = new VerificationApi("https://api.psma.com.au", "pHshAX3bvGGnYPeIUAXOWyLQOaHUkzr5", proxy);
    }

    @Test
    void shouldExecute() throws IOException {
        final VerificationReq req = new VerificationReq();
        req.setAddressId("GAACT717940975");
        final ApiRes<VerificationRes> res = geocoderApi.execute(req);

        assertNotNull(res);
        assertEquals(200, res.getCode());
        assertNotNull(res.getBody());
    }
}