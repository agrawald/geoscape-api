package au.com.mayi.geoscape.model;

import au.com.mayi.geoscape.enums.AdditionalProperty;
import au.com.mayi.geoscape.enums.Dataset;
import au.com.mayi.geoscape.enums.MatchType;
import au.com.mayi.geoscape.enums.StateFilter;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@Getter@Setter@JsonIgnoreProperties(ignoreUnknown = true)
public class Parameters {
    private MatchType matchType;
    private Dataset[] dataset;
    private AdditionalProperty[] additionalProperties;
    private int maxResults;
    private StateFilter[] stateFilter;
}
