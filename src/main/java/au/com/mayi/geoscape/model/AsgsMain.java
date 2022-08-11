package au.com.mayi.geoscape.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@Setter
@Getter
@JsonIgnoreProperties(ignoreUnknown = true)
public class AsgsMain {
    private int censusYear;
    private String mbId;
    private String sa1Id;
    private String sa2Id;
    private String sa2Name;
    private String sa3Id;
    private String sa3Name;
    private String sa4Id;
    private String sa4Name;

}
