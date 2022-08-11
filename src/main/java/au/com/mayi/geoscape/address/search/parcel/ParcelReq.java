package au.com.mayi.geoscape.address.search.parcel;

import au.com.mayi.geoscape.enums.AdditionalProperty;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
public class ParcelReq {
    private int maxResult;
    private AdditionalProperty additionalProperties;
    private String parcelId;
}
