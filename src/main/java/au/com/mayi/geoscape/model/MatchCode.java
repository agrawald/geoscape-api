package au.com.mayi.geoscape.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@Setter
@Getter
@JsonIgnoreProperties(ignoreUnknown = true)
public class MatchCode {
    private String siteName;
    private String complexUnitType;
    private String complexUnitIdentifier;
    private String complexLevelType;
    private String complexLevelNumber;
    private String streetNumber1;
    private String streetNumber2;
    private String streetName;
    private String streetType;
    private String localityName;
    private String stateTerritory;
    private String postcode;
    private String country;
}
