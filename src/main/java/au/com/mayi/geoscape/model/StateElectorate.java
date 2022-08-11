package au.com.mayi.geoscape.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Setter
@Getter
@JsonIgnoreProperties(ignoreUnknown = true)
@NoArgsConstructor
public class StateElectorate {
    private String stateElectoralPid;
    private String stateElectoralName;
    private String stateElectoralClassCode;
    private String stateElectoralType;
}
