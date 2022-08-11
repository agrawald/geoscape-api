package au.com.mayi.geoscape.address.search.mailpoint;

import au.com.mayi.geoscape.model.ApiRes;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.io.IOException;
import java.net.InetSocketAddress;
import java.net.Proxy;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

class MailPointApiTest {
    private static Proxy proxy;
    private MailPointApi mailpointApi;

    @BeforeAll
    public static void beforeAll() {
        if (System.getProperty("https.proxyHost") != null) {
            proxy = new Proxy(Proxy.Type.HTTP, new InetSocketAddress(System.getProperty("https.proxyHost"), Integer.parseInt(System.getProperty("https.proxyPort"))));
        }
    }

    @BeforeEach
    public void beforeEach() {
        mailpointApi = new MailPointApi("https://api.psma.com.au", "consumerKey", proxy);
    }

    @Test
    void shouldExecute() throws IOException {
        final MailPointReq req = new MailPointReq();
        req.setAddress("113 CANBERRA AV, GRIFFITH ACT 2603");
        final ApiRes<MailPointRes> res = mailpointApi.execute(req);

        assertNotNull(res);
        assertEquals(200, res.getCode());
        assertNotNull(res.getBody());
    }
}