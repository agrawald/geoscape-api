package au.com.mayi.geoscape.address.verification;

import au.com.mayi.geoscape.GeoscapeApi;
import au.com.mayi.geoscape.model.ApiReq;
import au.com.mayi.geoscape.model.ApiRes;

import java.io.IOException;
import java.net.Proxy;

public class VerificationApi
        extends GeoscapeApi<VerificationReq, VerificationRes> {
    private static final String API = "/v2/addresses/address/{addressId}";

    public VerificationApi(final String url, final String consumerKey) {
        super(url, API, consumerKey);
    }

    public VerificationApi(final String url, final String consumerKey, Proxy proxy) {
        super(url, API, consumerKey, proxy);
    }

    public ApiRes<VerificationRes> execute(final VerificationReq verificationReq) throws IOException {
        final ApiReq<VerificationReq> req = new ApiReq<>();
        req.setPathParam(toMap(verificationReq));
        return super.get(req, toJavaType(VerificationRes.class));
    }
}