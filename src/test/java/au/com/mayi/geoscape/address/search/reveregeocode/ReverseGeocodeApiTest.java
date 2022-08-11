package au.com.mayi.geoscape.address.search.reveregeocode;

import au.com.mayi.geoscape.address.search.reversegeocode.ReverseGeocodeApi;
import au.com.mayi.geoscape.address.search.reversegeocode.ReverseGeocodeReq;
import au.com.mayi.geoscape.address.search.reversegeocode.ReverseGeocodeRes;
import au.com.mayi.geoscape.model.ApiRes;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.io.IOException;
import java.net.InetSocketAddress;
import java.net.Proxy;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

class ReverseGeocodeApiTest {
    private static Proxy proxy;
    private ReverseGeocodeApi reverseGeocodeApi;

    @BeforeAll
    public static void beforeAll() {
        if (System.getProperty("https.proxyHost") != null) {
            proxy = new Proxy(Proxy.Type.HTTP, new InetSocketAddress(System.getProperty("https.proxyHost"), Integer.parseInt(System.getProperty("https.proxyPort"))));
        }
    }

    @BeforeEach
    public void beforeEach() {
        reverseGeocodeApi = new ReverseGeocodeApi("https://api.psma.com.au", "consumerKey", proxy);
    }

    @Test
    void shouldExecute() throws IOException {
        final ReverseGeocodeReq req = new ReverseGeocodeReq();
        req.setLatitude(-33.9097);
        req.setLongitude(150.8801);
        final ApiRes<ReverseGeocodeRes> res = reverseGeocodeApi.execute(req);

        assertNotNull(res);
        assertEquals(200, res.getCode());
        assertNotNull(res.getBody());
    }
}