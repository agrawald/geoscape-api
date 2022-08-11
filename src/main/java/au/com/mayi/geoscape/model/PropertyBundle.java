package au.com.mayi.geoscape.model;

import au.com.mayi.geoscape.enums.Source;
import au.com.mayi.geoscape.enums.StateFilter;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
public class PropertyBundle {
    private String propertyPid;
    private String propertyPolygonPid;
    private String contributorId;
    private String dateCreated;
    private String dateModified;
    private StateFilter state;
    private Source source;
    private boolean baseProperty;
    private double area;

}
