package au.com.mayi.geoscape.address.search.reversegeocode;

import au.com.mayi.geoscape.GeoscapeApi;
import au.com.mayi.geoscape.model.ApiReq;
import au.com.mayi.geoscape.model.ApiRes;

import java.io.IOException;
import java.net.Proxy;

public class ReverseGeocodeApi
        extends GeoscapeApi<ReverseGeocodeReq, ReverseGeocodeRes> {
    private static final String API = "/v2/addresses/reverseGeocoder";

    public ReverseGeocodeApi(final String url, final String consumerKey) {
        super(url, API, consumerKey);
    }

    public ReverseGeocodeApi(final String url, final String consumerKey, Proxy proxy) {
        super(url, API, consumerKey, proxy);
    }

    public ApiRes<ReverseGeocodeRes> execute(final ReverseGeocodeReq reverseGeocodeReq) throws IOException {
        final ApiReq<ReverseGeocodeReq> req = new ApiReq<>();
        req.setQueryParam(toMap(reverseGeocodeReq));
        return super.get(req, toJavaType(ReverseGeocodeRes.class));
    }
}

