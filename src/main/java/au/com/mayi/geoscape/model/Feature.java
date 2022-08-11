package au.com.mayi.geoscape.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@Setter
@Getter
@JsonIgnoreProperties(ignoreUnknown = true)
public class Feature {
    private String type;
    private String matchType;
    private String matchQuality;
    private long matchScore;
    private Properties properties;
    private Geometry geometry;
    private String[] messages;
    private MatchCode matchCode;
    private double matchDistance;
}
