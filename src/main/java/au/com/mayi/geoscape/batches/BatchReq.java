package au.com.mayi.geoscape.batches;

import au.com.mayi.geoscape.enums.RequestType;
import au.com.mayi.geoscape.model.Input;
import au.com.mayi.geoscape.model.Output;
import au.com.mayi.geoscape.model.Parameters;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
public class BatchReq {
    private RequestType type;
    private Parameters parameters;
    private Input input;
    private Output output;


}
