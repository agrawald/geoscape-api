package au.com.mayi.geoscape.address.search.geocoder;

import au.com.mayi.geoscape.model.ApiRes;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.io.IOException;
import java.net.InetSocketAddress;
import java.net.Proxy;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

class GeocoderApiTest {
    private static Proxy proxy;
    private GeocoderApi geocoderApi;

    @BeforeAll
    public static void beforeAll() {
        if (System.getProperty("https.proxyHost") != null) {
            proxy = new Proxy(Proxy.Type.HTTP, new InetSocketAddress(System.getProperty("https.proxyHost"), Integer.parseInt(System.getProperty("https.proxyPort"))));
        }
    }

    @BeforeEach
    public void beforeEach() {
        geocoderApi = new GeocoderApi("https://api.psma.com.au", "consumerKey", proxy);
    }

    @Test
    void shouldExecute() throws IOException {
        final GeocoderReq req = new GeocoderReq();
        req.setPostcode("2615");
        req.setStateTerritory("ACT");
        req.setLocalityName("Florey");
        req.setStreetName("Brunnich");
        req.setStreetType("Place");
        req.setStreetNumber1("8");
        final ApiRes<GeocoderRes> res = geocoderApi.execute(req);

        assertNotNull(res);
        assertEquals(200, res.getCode());
        assertNotNull(res.getBody());
    }
}