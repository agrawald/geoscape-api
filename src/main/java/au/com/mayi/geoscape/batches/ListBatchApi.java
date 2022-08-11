package au.com.mayi.geoscape.batches;

import au.com.mayi.geoscape.GeoscapeApi;
import au.com.mayi.geoscape.model.ApiReq;
import au.com.mayi.geoscape.model.ApiRes;

import java.io.IOException;
import java.net.Proxy;

public class ListBatchApi
        extends GeoscapeApi<Void, BatchRes[]> {

    private static final String API = "/v1/batches/batch";

    public ListBatchApi(final String url, final String consumerKey) {
        super(url, API, consumerKey);
    }

    public ListBatchApi(final String url, final String consumerKey, Proxy proxy) {
        super(url, API, consumerKey, proxy);
    }

    public ApiRes<BatchRes[]> execute() throws IOException {
        return super.get(new ApiReq<>(), toJavaType(BatchRes[].class));
    }
}