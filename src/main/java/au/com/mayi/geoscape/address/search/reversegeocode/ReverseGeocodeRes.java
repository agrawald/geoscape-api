package au.com.mayi.geoscape.address.search.reversegeocode;

import au.com.mayi.geoscape.model.*;
import au.com.mayi.geoscape.model.Feature;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@JsonIgnoreProperties(ignoreUnknown = true)
@Setter
@Getter
public class ReverseGeocodeRes{
    private String type;
    private double[] query;
    private Feature[] features;
    private String attribution;
}
