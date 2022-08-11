package au.com.mayi.geoscape.model;

import au.com.mayi.geoscape.enums.*;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Setter
@Getter
@NoArgsConstructor
@JsonIgnoreProperties(ignoreUnknown = true)
public class ParcelBundle {
    private String cadastrePid;
    private String cadastrePolygonPid;
    private String contributorId;
    private String dateCreated;
    private String dateModified;
    private StateFilter state;
    private String lot;
    private String plan;
    private String parcelId;
    private Source source;
    private ContributorStatus contributorStatus;
    private TitleStatus titleStatus;
    private ParcelType parcelType;
    private boolean baseParcel;
    private StartaType strataType;
    private int totalStrataCount;
    private int horizontalStrataCount;
    private int verticalStrataCount;
    private long area;
}
