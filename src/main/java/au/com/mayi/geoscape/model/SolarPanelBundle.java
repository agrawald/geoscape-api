package au.com.mayi.geoscape.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
public class SolarPanelBundle {
    private String solarAddressPid;
    private String dateCreated;
    private String dateModified;
    private String planningZone;
    private boolean isResidential;
    private String captureSource;
    private String solarReviewDate;
    private boolean solarFlag;
    private long solarArea;
    private long solarEstimatedPower;

}
