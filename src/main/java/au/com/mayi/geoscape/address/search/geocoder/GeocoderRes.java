package au.com.mayi.geoscape.address.search.geocoder;

import au.com.mayi.geoscape.model.Feature;
import au.com.mayi.geoscape.model.ParsedQuery;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@Getter
@Setter
public class GeocoderRes{
    private String type;
    private String query;
    private ParsedQuery parsedQuery;
    private Feature[] features;
    private String[] messages;
    private String attribution;
}
