package au.com.mayi.geoscape.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import okhttp3.Headers;

import java.util.Map;

@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
public class ApiReq<T> {
    private Map<String, ?> queryParam;
    private Map<String, ?> pathParam;
    private Headers headers;
    private T body;
}
