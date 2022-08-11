package au.com.mayi.geoscape.address.search.parcel;

import au.com.mayi.geoscape.model.Feature;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@JsonIgnoreProperties(ignoreUnknown = true)
@Setter
@Getter
public class ParcelRes{
    private String type;
    private Feature[] features;
    private String[] messages;
    private String attribution;
}
