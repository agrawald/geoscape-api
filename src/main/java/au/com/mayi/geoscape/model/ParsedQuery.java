package au.com.mayi.geoscape.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
public class ParsedQuery {
    private String localityName;
    private String postcode;
    private String stateTerritory;
    private String streetName;
    private String streetNumber1;
    private String streetNumber2;
    private String complexUnitIdentifier;
    private String complexUnitType;
    private String siteName;
    private String streetType;
    private String lotIdentifier;
    private String streetSuffix;
    private String streetPrefix;
    private String complexLevelIdentifier;
    private String complexLevelType;
    private String complexLevelNumber;
    private String complexStreetName;
    private String streetNumberDenoter;
    private String blockDenoter;
    private String blockNumberDenoter;
    private String sectionDenoter;
    private String sectionNumberDenoter;
    private String numberFirst;
    private String numberSecond;
    private String locationDescriptor;
    private String countryNameCode;
    private String deliveryPointIdentifier;
    private String postalDeliveryIdentifier;
    private String postalDeliveryTypeCode;
    private String cadastralIdentifier;
    private String streetNumberRange;
    private String country;
}
