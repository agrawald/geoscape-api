package au.com.mayi.geoscape;

import au.com.mayi.geoscape.model.ApiReq;
import au.com.mayi.geoscape.model.ApiRes;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;
import okhttp3.*;

import java.io.IOException;
import java.net.Proxy;
import java.util.Map;
import java.util.Objects;

public class GeoscapeApi<Req, Res> {
    private static final MediaType JSON_MEDIA_TYPE = MediaType.get("application/json; charset=utf-8");
    private final String url;
    protected final OkHttpClient client;
    private final String operation;
    private final ObjectMapper objectMapper;
    private final String consumerKey;

    public GeoscapeApi(String url, String operation, String consumerKey) {
        this.url = url;
        this.operation = operation;
        this.consumerKey = consumerKey;
        this.client = new OkHttpClient.Builder().build();
        this.objectMapper = objectMapper();
    }

    protected GeoscapeApi(String url, String operation, String consumerKey, Proxy proxy) {
        this.url = url;
        this.operation = operation;
        this.consumerKey = consumerKey;
        this.client = new OkHttpClient.Builder().proxy(proxy).build();
        this.objectMapper = objectMapper();
    }

    private ObjectMapper objectMapper() {
        final ObjectMapper mapper = new ObjectMapper();
        mapper.findAndRegisterModules();
        mapper.enable(JsonGenerator.Feature.IGNORE_UNKNOWN);
        mapper.enable(SerializationFeature.WRITE_ENUMS_USING_TO_STRING);
        return mapper;
    }

    protected ApiRes<Res> execute(Request request, JavaType javaType) throws IOException {
        try (final Response response = client.newCall(request).execute()) {
            assert response.body() != null;
            final Res body = this.objectMapper.readValue(response.body().byteStream(), javaType);
            final Headers headers = response.headers();
            return new ApiRes<>(headers, body, response.code());
        }
    }

    protected ApiRes<Res> get(final ApiReq<Req> req, JavaType javaType) throws IOException {
        final Request request = requestBuilder(httpUrlBuilder(req)).build();
        return execute(request, javaType);
    }

    protected ApiRes<Res> post(final ApiReq<Req> req, final JavaType javaType) throws IOException {
        final String json = this.objectMapper.writeValueAsString(req);
        final RequestBody body = RequestBody.create(json, JSON_MEDIA_TYPE);
        final Request request = requestBuilder(httpUrlBuilder(req)).post(body).build();
        return execute(request, javaType);
    }

    protected ApiRes<Res> put(final ApiReq<Req> req, final JavaType javaType) throws IOException {
        final String json = this.objectMapper.writeValueAsString(req);
        final RequestBody body = RequestBody.create(json, JSON_MEDIA_TYPE);
        final Request request = requestBuilder(httpUrlBuilder(req)).post(body).build();
        return execute(request, javaType);
    }

    private HttpUrl.Builder httpUrlBuilder(final ApiReq<Req> req) {

        String uri = url + operation;
        if (req.getPathParam() != null) {
            for (final Map.Entry<String, ?> param : req.getPathParam().entrySet()) {
                if (param.getValue() != null) {
                    uri = uri.replace("{" + param.getKey() + "}", String.valueOf(param.getValue()));
                }
            }
        }

        final HttpUrl.Builder builder = Objects.requireNonNull(HttpUrl.parse(uri)).newBuilder();
        if (req.getQueryParam() != null) {
            req.getQueryParam()
                    .entrySet()
                    .stream()
                    .filter(entry -> entry.getValue() != null)
                    .forEach(entry -> {
                        final String value = String.valueOf(entry.getValue());
                        builder.addQueryParameter(entry.getKey(), value);
                    });
        }
        return builder;
    }

    private Request.Builder requestBuilder(final HttpUrl.Builder httpUrlBuilder) {
        return new Request.Builder()
                .url(httpUrlBuilder.build())
                .addHeader("Authorization", this.consumerKey);
    }

    protected Map<String, ?> toMap(final Object value) {
        final JavaType javaType = toJavaType(Map.class);
        return this.objectMapper.convertValue(value, javaType);
    }

    protected JavaType toJavaType(Class<?> clazz) {
        return this.objectMapper.constructType(clazz);
    }

}
