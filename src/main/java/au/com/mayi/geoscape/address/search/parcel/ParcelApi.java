package au.com.mayi.geoscape.address.search.parcel;

import au.com.mayi.geoscape.GeoscapeApi;
import au.com.mayi.geoscape.model.ApiReq;
import au.com.mayi.geoscape.model.ApiRes;

import java.io.IOException;
import java.net.Proxy;

public class ParcelApi
        extends GeoscapeApi<ParcelReq, ParcelRes> {
    private static final String API = "/v2/addresses/findByParcel";

    public ParcelApi(final String url, final String consumerKey) {
        super(url, API, consumerKey);
    }

    public ParcelApi(final String url, final String consumerKey, Proxy proxy) {
        super(url, API, consumerKey, proxy);
    }

    public ApiRes<ParcelRes> execute(final ParcelReq parcelReq) throws IOException {
        final ApiReq<ParcelReq> req = new ApiReq<>();
        req.setPathParam(toMap(parcelReq));
        return super.get(req, toJavaType(ParcelRes.class));
    }
}
