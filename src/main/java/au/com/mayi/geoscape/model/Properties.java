package au.com.mayi.geoscape.model;

import au.com.mayi.geoscape.enums.AddressRecordType;
import au.com.mayi.geoscape.enums.AliasPrincipal;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
public class Properties {
    private String dpid;
    private String addressId;
    private String jurisdictionId;
    private AddressRecordType addressRecordType;
    private AliasPrincipal aliasPrincipal;
    private String geoFeature;
    private String cadastralIdentifier;
    private String formattedAddress;
    private String localityName;
    private String postcode;
    private String stateTerritory;
    private String streetName;
    private String streetNumber1;
    private String streetNumber2;
    private String complexUnitIdentifier;
    private String complexUnitType;
    private String complexUnitTypeDescription;
    private String siteName;
    private String streetType;
    private String streetTypeDescription;
    private String lotIdentifier;
    private String streetSuffix;
    private String streetPrefix;
    private String complexLevelIdentifier;
    private String complexLevelType;
    private String complexLevelTypeDescription;
    private AsgsMain asgsMain;
    private AsgsRemoteness asgsRemoteness;
    private CommonwealthElectorate commonwealthElectorate;
    private LocalGovernmentArea localGovernmentArea;
    private String[] relatedBuildingIds;
    private StateElectorate stateElectorate;
    private SolarPanelBundle solarPanelBundle;
    private ParcelBundle parcelBundle;
    private PropertyBundle propertyBundle;
    private String[] localityNeighbour;
    private String[] localityAlias;
    private String localityId;
    private String streetLocalityId;
    private String[] streetAlias;
    private String complexLevelNumber;
    private String barcode;
    private String postalDeliveryTypeCode;
    private String postalDeliveryIdentifier;
}
