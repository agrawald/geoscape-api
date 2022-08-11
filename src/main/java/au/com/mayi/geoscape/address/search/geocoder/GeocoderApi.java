package au.com.mayi.geoscape.address.search.geocoder;

import au.com.mayi.geoscape.GeoscapeApi;
import au.com.mayi.geoscape.model.ApiReq;
import au.com.mayi.geoscape.model.ApiRes;

import java.io.IOException;
import java.net.Proxy;
import java.util.Map;

public class GeocoderApi
        extends GeoscapeApi<Void, GeocoderRes> {
    private static final String API = "/v2/addresses/geocoder";

    public GeocoderApi(final String url, final String consumerKey) {
        super(url, API, consumerKey);
    }

    public GeocoderApi(final String url, final String consumerKey, Proxy proxy) {
        super(url, API, consumerKey, proxy);
    }

    public ApiRes<GeocoderRes> execute(final GeocoderReq geocoderReq) throws IOException {
        final ApiReq<Void> req = new ApiReq<>();
        final Map<String, ?> queryParams = toMap(geocoderReq);
        req.setQueryParam(queryParams);
        return super.get(req, toJavaType(GeocoderRes.class));
    }
}
