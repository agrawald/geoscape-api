package au.com.mayi.geoscape.address.search.geocoder;

import au.com.mayi.geoscape.enums.AdditionalProperty;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@Getter
@Setter
public class GeocoderReq {
    private AdditionalProperty additionalProperties;
    private String address;
    private String complexLevelType;
    private String complexLevelNumber;
    private String complexUnitType;
    private String complexUnitIdentifier;
    private String streetNumber1;
    private String streetNumber2;
    private String streetName;
    private String streetType;
    private String streetSuffix;
    private String siteName;
    private String lotIdentifier;
    private String localityName;
    private String stateTerritory;
    private String postcode;
}
