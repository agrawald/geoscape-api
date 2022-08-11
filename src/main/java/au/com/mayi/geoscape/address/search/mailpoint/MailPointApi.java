package au.com.mayi.geoscape.address.search.mailpoint;

import au.com.mayi.geoscape.GeoscapeApi;
import au.com.mayi.geoscape.model.ApiReq;
import au.com.mayi.geoscape.model.ApiRes;

import java.io.IOException;
import java.net.Proxy;

public class MailPointApi
        extends GeoscapeApi<Void, MailPointRes> {
    private static final String API = "/v2/addresses/mailPoint";

    public MailPointApi(final String url, final String consumerKey) {
        super(url, API, consumerKey);
    }

    public MailPointApi(final String url, final String consumerKey, Proxy proxy) {
        super(url, API, consumerKey, proxy);
    }

    public ApiRes<MailPointRes> execute(final MailPointReq mailpointReq) throws IOException {
        final ApiReq<Void> request = new ApiReq<>();
        request.setQueryParam(toMap(mailpointReq));
        return super.get(request, toJavaType(MailPointRes.class));
    }
}
