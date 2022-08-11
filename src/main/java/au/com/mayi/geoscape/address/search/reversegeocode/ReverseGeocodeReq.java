package au.com.mayi.geoscape.address.search.reversegeocode;

import au.com.mayi.geoscape.enums.AdditionalProperty;
import au.com.mayi.geoscape.enums.Dataset;
import au.com.mayi.geoscape.enums.MatchType;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
public class ReverseGeocodeReq {
    private int maxResult;
    private double latitude;
    private double longitude;
    private AdditionalProperty additionalProperties;
    private Dataset dataset;
    private String excludeAlias;
    private MatchType matchType;
}
