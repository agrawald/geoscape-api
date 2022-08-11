package au.com.mayi.geoscape.batches;

import au.com.mayi.geoscape.GeoscapeApi;
import au.com.mayi.geoscape.model.ApiReq;
import au.com.mayi.geoscape.model.ApiRes;

import java.io.IOException;
import java.net.Proxy;

public class StatusBatchApi
        extends GeoscapeApi<BatchReq, BatchRes> {

    private static final String API = "/v1/batches/batch/{batchId}";

    public StatusBatchApi(final String url, final String consumerKey) {
        super(url, API, consumerKey);
    }

    public StatusBatchApi(final String url, final String consumerKey, Proxy proxy) {
        super(url, API, consumerKey, proxy);
    }

    public ApiRes<BatchRes> execute(BatchReq batchReq) throws IOException {
        final ApiReq<BatchReq> req = new ApiReq<>();
        req.setPathParam(toMap(batchReq));
        return super.get(req, toJavaType(BatchRes.class));
    }
}